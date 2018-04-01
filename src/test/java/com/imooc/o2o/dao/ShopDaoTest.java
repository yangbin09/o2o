package com.imooc.o2o.dao;


import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;
	
	@Test
	@Ignore
	public void testQueryShopList(){
		Shop shopCondition=new Shop();
		PersonInfo owner =new PersonInfo(); 
		/*owner.setUserId(1L);
		shopCondition.setOwner(owner);*/
		shopCondition.setShopName("0");
		int count = shopDao.queryByShopCount(shopCondition);
		System.out.println(count);
		List<Shop> queryShopList = shopDao.queryShopList(shopCondition, 0, 5);
		System.out.println(queryShopList);
	}
	
	@Test
	public void testQueryByShopId(){
		long shopId=29L;
		Shop shop = shopDao.queryByShopId(shopId);
		System.out.println("Id: "+shop.getArea().getAreaId());
		System.out.println("区域: "+shop.getArea().getAreaName());
		System.out.println(shop.toString());
	}

	@Test
	@Ignore
	public void testInsertShop() {
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
		shop.setShopName("测试店铺001");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("我是电话号码");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");

		System.out.println(shop);
		int eddectedNum = shopDao.insertShop(shop);

	}

	@Test
	@Ignore
	public void testUpdateShop() {
		Shop shop = new Shop();
		shop.setShopId(39L);

		shop.setPhone("123456");
		shop.setCreateTime(new Date());
		System.out.println(shop);
		int eddectedNum = shopDao.updateShop(shop);

	}
	@Test
	@Ignore
	public void testid(){
		Shop id = shopDao.queryByShopId(28);
		System.out.println(id);
	}
}
