package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2017年12月30日 下午12:23:11 
* 类说明 ：处理请求参数的工具类
*/

public class HttpServletRequestUtil {
	/**
	 * 将字符串转为整型
	 * @param request
	 * @param key
	 * @return
	 */
	public static int getInt(HttpServletRequest request, String key) {
		try {
			return Integer.decode(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}
	/**
	 * 将字符串转为long
	 * @param request
	 * @param key
	 * @return
	 */
	public static long getLong(HttpServletRequest request, String key) {
		try {
			return Long.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}
	/**
	 * 将字符串转为double
	 * @param request
	 * @param key
	 * @return
	 */
	public static Double getDouble(HttpServletRequest request, String key) {
		try {
			return Double.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}
	/**
	 * 将字符串转为boolean
	 * @param request
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(HttpServletRequest request, String key) {
		try {
			return Boolean.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * 将request对应的值转换为Steing 类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getString(HttpServletRequest request, String key) {
		try {
			String result = request.getParameter(key);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result)) {
				result = null;
			}
			return result;
		} catch (Exception e) {
			return null;
		}
	}
}
