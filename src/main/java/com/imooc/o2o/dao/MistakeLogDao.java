package com.imooc.o2o.dao;

import com.imooc.o2o.entity.MistakeLog;
import com.imooc.o2o.entity.Shop;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月30日 下午12:48:01 类说明 ：
 */

public interface MistakeLogDao {
	/**
	 * 新增错误信息
	 * @param mistakeLog
	 * @return
	 */
	int inserteLog(MistakeLog mistakeLog);
}
