package com.bnuz.yxx.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.bnuz.yxx.domain.Attachment;
import com.bnuz.yxx.domain.Page;
import com.bnuz.yxx.domain.Paper;
import com.bnuz.yxx.service.AttachService;
import com.bnuz.yxx.service.PaperService;

/**
 * Servlet implementation class PaperController
 */
@WebServlet("/PaperController")
public class PaperController extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private PaperService paperService = null;
	private AttachService attacService = null;

	public PaperController() {
		paperService = new PaperService();
		attacService = new AttachService();
	}

	/*
	 * 处理add.jsp传过来的值
	 */

	public String addPaper(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//设置论文保存的路径
		String storePath = getServletContext().getRealPath("/paperImage");
		//获得当前用户的session
		HttpSession session = request.getSession();
		String title = null;
		//new 一个附件对象
		Attachment attac = new Attachment();
		//获取当前用户的id
		System.out.println(session);
		int uid = (int) session.getAttribute("uid");
		// 检测是否有文件上传
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (!isMultipart) {
			response.sendRedirect("/paper/add.jsp");
		}

		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Configure a repository (to ensure a secure temp location is used)
		ServletContext servletContext = this.getServletConfig()
				.getServletContext();
		File repository = (File) servletContext
				.getAttribute("javax.servlet.context.tempdir");
		factory.setRepository(repository);

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// Create a file to put image
		String saveFilePath = storePath;
		File file = new File(saveFilePath);
		if (!file.exists()) {
			file.mkdir();
		}

		// Parse the request
		List<FileItem> items = null;
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			throw new RuntimeException(e);
		}

		// Process the uploaded items
		Iterator<FileItem> iter = items.iterator();
		while (iter.hasNext()) {
			FileItem item = iter.next();

			if (item.isFormField()) {
				String fieldName = item.getFieldName();
				String value = item.getString("utf-8");
				if (fieldName.equals("title")) {
					title = value;
				}
			} else {
				InputStream uploadedStraeam = item.getInputStream();
				// 获得上传文件的绝对路径
				String fileName = item.getName();
				// 截取图片文件名
				fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
				// 重新构造图片名
				fileName = new Date().getTime() + "."
						+ fileName.split("\\.")[1];
				// 设置保存路径和文件名
				String storeFile = storePath + "\\" + fileName;
				OutputStream out = new FileOutputStream(storeFile);
				byte b[] = new byte[1024];
				int len = -1;
				while ((len = uploadedStraeam.read(b)) != -1) {
					out.write(b, 0, len);
				}
				// 往数据库里插入图片
				attac.setUserId(uid);
				attac.setImagePath("paperImage\\" + fileName);
				attacService.insert(attac);
				out.close();
				uploadedStraeam.close();
			}
		}
		//为论文对象赋值
		Paper paper = new Paper();
		paper.setTitle(title);
		paper.setUserId(uid);
		paper.setDate(new Date());
		paperService.insert(paper);
		// 重定向到index.jsp
		request.getRequestDispatcher("/paper/show.jsp").forward(request, response);
		return null;
		//return "forward:/paper/show.jsp";
	}

	/*
	 * 显示Paper
	 */
	public String showPaper(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Paper> paperList = null;
		int currentPage = 1;
		int pages, count;
		if (request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		//获取用户的权限：
		HttpSession session = request.getSession();
			//1.根据用户的role and id
		String permission = (String)session.getAttribute("role");
		int id = (int)session.getAttribute("uid");
		
		session.setAttribute("myname", "888888888888888888888888");
		
		
		System.out.println("PaperController    showPaper++++++++++++++" + session +  "    " + id);
		
		
		
		//根据权限获取不同的论文
		if(permission.equals("super")) {
			paperList = paperService.selectAll(currentPage);
			count = paperService.countAllPaer();
		} else {
			paperList = paperService.selectAllById(id, currentPage);
			count = paperService.countAllPaerById(id);
		}
		request.setAttribute("paperList", paperList);
		if (count % Page.PAGE_SIZE == 0) {
			pages = count / Page.PAGE_SIZE;
		} else {
			pages = count / Page.PAGE_SIZE + 1;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= pages; i++) {
			if (i == currentPage) {
				sb.append("[" + i + "]");
			} else {
				sb.append("<a href='PaperController?method=showUser&page=" + i
						+ "'>" + i + "</a>");
			}
			sb.append("  ");
		}
		request.setAttribute("bar", sb.toString());
		request.getRequestDispatcher("/paper/show.jsp").forward(request, response);
		return null;
		//return "forward:/paper/show.jsp";
	}
}
