package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.ShopCategory;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2018年1月1日 下午5:09:58 
 * 类说明 ：店铺类别的测试类
 */

public class ShopCategoryServiceTest extends BaseTest {
	@Autowired
	private ShopCategoryService shopCategoryService;

	@Test
	public void testGetAreaList() {

		ShopCategory testCategory = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(28L);
		testCategory.setParent(parentCategory);
		List<ShopCategory> ShopCategoryList = shopCategoryService.getShopCategoryList(testCategory);
		System.out.println(ShopCategoryList.get(1).getShopCategoryName());
	}
}
