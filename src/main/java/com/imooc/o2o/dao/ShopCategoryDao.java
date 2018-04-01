package com.imooc.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.ShopCategory;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2018年1月1日 下午4:29:15
 * 类说明 ：店铺类别的接口
 */

public interface ShopCategoryDao {
	/**
	 * test
	 * @param shopCategoryCondition  传入店铺实体
	 * @return 返回TEST
	 */
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition")ShopCategory shopCategoryCondition);
}
