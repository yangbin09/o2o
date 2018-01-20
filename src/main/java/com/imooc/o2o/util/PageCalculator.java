package com.imooc.o2o.util;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2018年1月19日 下午9:19:29 
* 类说明 ：分页用到的工具类
*/

public class PageCalculator {
	/**
	 * 根据页码的值选取页码的数据
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public static int calculateRowIndex(int pageIndex,int pageSize){	
		return (pageIndex>0)?(pageIndex-1)*pageSize:0;
	}
}
