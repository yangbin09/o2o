package com.imooc.o2o.exceptions;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.entity.MistakeLog;
import com.imooc.o2o.service.MistakeLogService;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午11:31:12 类说明 ：店铺的异常类
 */

public class ShopOperationException extends RuntimeException {
	
	@Autowired
	private MistakeLogService mistakeLogService;
	
	private static final long serialVersionUID = 2361446884822298905L;

	public ShopOperationException(String msg) {
       super(msg);
       System.out.println("---------------------------------------------------------------");
       MistakeLog mistakeLog = new MistakeLog();
		mistakeLog.setCreateTime(new Date());
		mistakeLog.setMistakeCause(msg);
		mistakeLog.setRamarks("运行的环境：");
		mistakeLog.setTableName("tb_shop");
       
       mistakeLogService.addMistakeLog(mistakeLog);
	};
}
