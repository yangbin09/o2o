package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.ShopCategory;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2018年1月1日 下午4:42:14 
* 类说明 ：店铺类别测试类
*/

public class ShopCategoryDaoTest extends BaseTest{
	@Autowired
	private ShopCategoryDao shopCategoryDao ;
	
	@Test
	public void testQueryShopCategory(){
		List<ShopCategory> ShopCategoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
		System.out.println(ShopCategoryList.toString());
		assertEquals(18, ShopCategoryList.size());
		ShopCategory testCategory=new ShopCategory();
		ShopCategory parentCategory=new ShopCategory();
		parentCategory.setShopCategoryId(28L);
		testCategory.setParent(parentCategory);
		 ShopCategoryList = shopCategoryDao.queryShopCategory(testCategory);
		 System.out.println(ShopCategoryList.get(0).getShopCategoryName());
	}
}
