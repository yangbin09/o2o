package com.imooc.o2o.enums;

/** 
* @author 作者 E-mail: 百年叔叔 1692207904@qq.com
* @version 创建时间：2017年12月29日 上午1:49:53 
* 类说明 ：新增店铺的枚举类
*/
public enum ShopStateEnum {
	CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001,
			"内部系统错误"), NULL_SHOPID(-1002, "Shopid为空"),NULL_SHOP(-1003,"shop信息为空");

	private int state;
	private String stateInfo;

	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	/**
	 * 根据传入的state返回相对应的enum值
	 * 
	 * @return
	 */
	public static ShopStateEnum stateOf(int state) {
		for (ShopStateEnum stateEnum : values()) {
			if (stateEnum.getState() == state) {
               return stateEnum;
			}

		}
		return null;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

}
