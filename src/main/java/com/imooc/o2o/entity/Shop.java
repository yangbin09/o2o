package com.imooc.o2o.entity;

import java.util.Date;
/**
 * 店铺的实体类
 * @author Administrator
 *
 */
public class Shop {
	//店铺ID
	private Long shopId;
	//店铺名字
	private String shopName;
	//店铺描述
	private String shopDesc;
	//具体的地址
	private String shopAddr;
	//联系方式
	private String phone;
	//店铺缩略图片地址
	private String shopImg;
	//店铺的权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//修改时间
	private Date lastEditTime;
	// -1.不可用 0.审核中 1.可用
	private Integer enableStatus;
	// 超级管理员给店家的提醒
	private String advice;
	//区域标识属于哪个区域
	private Area area;
	//用户标识是谁创建的
	private PersonInfo owner;
	//店铺类别
	private ShopCategory shopCategory;

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDesc() {
		return shopDesc;
	}

	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopImg() {
		return shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public PersonInfo getOwner() {
		return owner;
	}

	public void setOwner(PersonInfo owner) {
		this.owner = owner;
	}

	public ShopCategory getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopDesc=" + shopDesc + ", shopAddr=" + shopAddr
				+ ", phone=" + phone + ", shopImg=" + shopImg + ", priority=" + priority + ", createTime=" + createTime
				+ ", lastEditTime=" + lastEditTime + ", enableStatus=" + enableStatus + ", advice=" + advice + ", area="
				+ area + ", owner=" + owner + ", shopCategory=" + shopCategory + "]";
	}

	public Shop(Long shopId, String shopName, String shopDesc, String shopAddr, String phone, String shopImg,
			Integer priority, Date createTime, Date lastEditTime, Integer enableStatus, String advice, Area area,
			PersonInfo owner, ShopCategory shopCategory) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopDesc = shopDesc;
		this.shopAddr = shopAddr;
		this.phone = phone;
		this.shopImg = shopImg;
		this.priority = priority;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
		this.enableStatus = enableStatus;
		this.advice = advice;
		this.area = area;
		this.owner = owner;
		this.shopCategory = shopCategory;
	}

	public Shop() {
		super();
	}

}
