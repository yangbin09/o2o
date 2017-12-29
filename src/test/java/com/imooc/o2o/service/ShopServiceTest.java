package com.imooc.o2o.service;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import com.imooc.o2o.enums.ShopStateEnum;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午11:38:35 类说明 ：店铺管理测试类
 */

public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;
    
	@Test
	public void testAddShop(){
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);

		shopCategory.setShopCategoryId(10l);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试店铺002");
		shop.setShopDesc("test1");
		shop.setShopAddr("test1");
		shop.setPhone("我是电话号码");
		
		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File shopImg=new File("D:\\img\\xiaohuang.jpg");
		
		ShopExecution se = shopService.addShop(shop, shopImg);
		
		assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
	}
}




