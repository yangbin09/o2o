package com.imooc.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.Shop;

public interface ShopDao {
	
	/**
	 * 分页查询店铺，可以输入的条件有：店铺名称(模糊)，店铺状态，店铺状态，区域ID，owner
	 * @param shopCondition 传入店铺实体类
	 * @param rowIndex   从第几行开始取
	 * @param pageSize   返回的条数
	 * @return
	 */
	List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,@Param("rowIndex") int rowIndex,@Param("pageSize") int pageSize);
	
	/**
	 * 根据查询条件返回总条数
	 * @param shopCondition
	 * @return
	 */
	int queryByShopCount(@Param("shopCondition") Shop shopCondition);
	
	/**
	 * 根据ID查询店铺
	 * @param shopId
	 * @return
	 */
	Shop queryByShopId(long shopId);
	/**
	 * 新增店铺
	 * @param shop
	 * @return
	 */
   int insertShop(Shop shop);
   
   /**
    * 更新店铺信息
    * @param shop
    * @return
    */
   int updateShop(Shop shop);
}
