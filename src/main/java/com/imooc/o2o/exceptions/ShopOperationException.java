package com.imooc.o2o.exceptions;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午11:31:12 类说明 ：店铺的异常类
 */

public class ShopOperationException extends RuntimeException {
	
	
	private static final long serialVersionUID = 2361446884822298905L;

	public ShopOperationException(String msg) {
       super(msg);
	};
}
