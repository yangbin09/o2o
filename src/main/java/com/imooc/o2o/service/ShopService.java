package com.imooc.o2o.service;

import java.io.File;
import java.io.InputStream;

import org.springframework.stereotype.Service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午10:36:44 接口说明 ： 店铺注册的一个接口
 */

public interface ShopService {
	/**
	 * 根据shopCondition分页返回数据
	 * @param shopCondition
	 * @param pageindex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition,int pageindex, int pageSize);
	
	/**
	 * 通过店铺Id获取店铺信息
	 * 
	 * @param shopId
	 * @return
	 */
	Shop getByShopId(long shopId);

	/**
	 * 更新店铺信息
	 * 
	 * @param shop
	 * @param shopinputStream
	 * @param fileName
	 * @return
	 */
	ShopExecution modifyShop(Shop shop, InputStream shopinputStream, String fileName) throws ShopOperationException;

	/**
	 * 注册店铺信息，包括图片处理
	 * 
	 * @param shop
	 * @param shopinputStream
	 * @param fileName
	 * @return
	 */
	ShopExecution addShop(Shop shop, InputStream shopinputStream, String fileName) throws ShopOperationException;;
}
