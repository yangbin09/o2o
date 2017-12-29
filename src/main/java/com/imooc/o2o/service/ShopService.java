package com.imooc.o2o.service;

import java.io.File;

import org.springframework.stereotype.Service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月29日 下午10:36:44 接口说明 ： 店铺注册的一个接口
 */

public interface ShopService {

	ShopExecution addShop(Shop shop,File shopImg);
}
