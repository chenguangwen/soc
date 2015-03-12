package com.bnuz.yxx.commons;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

/**
 * СС����
 * 
 * @author pomodory
 *
 */

public class CommonUtils {
	/**
	 * ����һ�����ظ����ַ���
	 * 
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();

	}

	/**
	 * ��Mapת���ɶ���
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
