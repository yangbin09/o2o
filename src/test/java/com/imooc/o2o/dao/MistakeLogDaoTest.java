package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.MistakeLog;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;

public class MistakeLogDaoTest extends BaseTest {
	
	@Autowired
	private MistakeLogDao MistakeLogDao;

	@Test
	public void testInsertShop() {
		
		MistakeLog mistakeLog = new MistakeLog();
		mistakeLog.setCreateTime(new Date());
		mistakeLog.setMistakeCause("测数据哦");
		mistakeLog.setRamarks("不知道");
		mistakeLog.setTableName("tb_shop");
		
		int eddectedNum = MistakeLogDao.inserteLog(mistakeLog);

	}

	
	
}
