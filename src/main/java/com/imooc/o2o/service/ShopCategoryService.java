package com.imooc.o2o.service;

import java.util.List;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.ShopCategory;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2018年1月1日 下午5:03:44 
* 类说明 ：店铺类别的接口
*/

public interface ShopCategoryService {
	/**
	 * 获取店铺类别
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
