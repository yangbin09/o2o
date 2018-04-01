package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.Area;
/**
 * @author 阳斌
 * @date   2018/4/1 15:04
 * E-mail  1692207904@qq.com
 * 说明：
 */
public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
