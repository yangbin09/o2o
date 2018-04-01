package com.imooc.o2o.service;

import com.imooc.o2o.entity.MistakeLog;
/**
 * @author 阳斌
 * @date   2018/4/1 15:48
 * E-mail  1692207904@qq.com
 * 说明：   日志的一个service
 */
public interface MistakeLogService {
	/**
	 * 增加日志
	 * @param mistakeLog 日志的一个实体
	 * @return 返回一条记录
	 */
	int addMistakeLog(MistakeLog mistakeLog);
}
