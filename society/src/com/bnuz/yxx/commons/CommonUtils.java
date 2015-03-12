package com.bnuz.yxx.commons;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 小小工具
 * 
 * @author pomodory
 *
 */

public class CommonUtils {
	/**
	 * 返回一个不重复的字符串
	 * 
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();

	}

	/**
	 * 把Map转换成对象
	 * 
	 * @param map
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> T toBean(Map map, Class<T> clazz) {
		try {
			T bean = clazz.newInstance();
			BeanUtils.populate(bean, map);
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
