package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.MistakeLog;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月30日 下午2:04:44 类说明 ：测试错误信息类
 */

public class MistakeLogServiceTest extends BaseTest {

	@Autowired
	private MistakeLogService mistakeLogService;
	
	 @Test
	  public void testAddMistakeLog(){
		 MistakeLog mistakeLog = new MistakeLog();
			mistakeLog.setCreateTime(new Date());
			mistakeLog.setMistakeCause("测数据哦22");
			mistakeLog.setRamarks("不知道"); 
			mistakeLog.setTableName("tb_shop");
			
			int eddectedNum = mistakeLogService.addMistakeLog(mistakeLog);
	  }
}
