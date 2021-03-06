package com.imooc.o2o.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.o2o.dao.MistakeLogDao;
import com.imooc.o2o.entity.MistakeLog;
import com.imooc.o2o.service.MistakeLogService;

/**
 * @author 阳斌
 * @version 2018/4/1
 */
@Service
public class MistakeLogServiceImpl implements MistakeLogService{
	@Autowired
	private MistakeLogDao MistakeLogDao;

	@Override
	public int addMistakeLog(MistakeLog mistakeLog) {
		
		return  MistakeLogDao.inserteLog(mistakeLog);
	}

	

}
