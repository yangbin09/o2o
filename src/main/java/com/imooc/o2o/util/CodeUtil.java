package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2018年1月1日 下午6:14:12 
* 类说明 ：验证码判断的工具类
*/

public class CodeUtil {
	public static boolean checkVerifyCode(HttpServletRequest request) {
		
		String verifyCodeExpected = (String) request.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		
		if (verifyCodeActual == null ){
			return false;
		}
		verifyCodeActual=verifyCodeActual.toUpperCase();
		if(!verifyCodeActual.equals(verifyCodeExpected)){
			return false;
		}
		return true;
	}
}

