package com.imooc.o2o.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtil;
import com.imooc.o2o.util.PathUtil;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午10:38:54 类说明 ：店铺管理实现类
 */
@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopDao shopdao;

	@Override
	@Transactional
	public ShopExecution addShop(Shop shop, File shopImg) {
		// 空值判断
		if (shop == null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			// 给店铺信息赋初始值
			shop.setEnableStatus(0);
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			int effectedNum = shopdao.insertShop(shop);

			if (effectedNum <= 0) {
				throw new ShopOperationException("店铺创建失败 ");
			} else {
				if (shopImg != null) {
					// 存储图片

					try {
						addShopImg(shop, shopImg);
					} catch (Exception e) {
						throw new ShopOperationException("addShopImg error:" + e.getMessage());
					}
					// 更新店铺的图片地址
					effectedNum = shopdao.updateShop(shop);
					if (effectedNum <= 0) {
						throw new ShopOperationException("更新图片地址失败！");
					}
				}
			}

		} catch (Exception e) {
			throw new RuntimeException("addShop error:" + e.getMessage());
		}

		return new ShopExecution(ShopStateEnum.CHECK, shop);
	}

	private void addShopImg(Shop shop, File shopImg) {
		// 获取shop图片的相对值路径
		String dest = PathUtil.getShopImagePath(shop.getShopId());
		/*
		 * String shopImgAddr = ImageUtil.generateThumbnail(shopImgInputStream,
		 * fileName, dest);
		 *  shop.setShopImg(shopImgAddr);
		 */
	}

}