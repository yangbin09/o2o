package com.imooc.o2o.entity;

import java.util.Date;
/**
 * 店铺类别的实体类
 * @author Administrator
 *
 */
public class ShopCategory {
	/**
	 * id
	 */
	private Long shopCategoryId;
	/**
	 * 店铺类别名字
	 */
	private String shopCategoryName;
	/**
	 * 店铺类别描述
	 */
	private String shopCategoryDesc;
	/**
	 * 图片链接地址
	 */
	private String shopCategoryImg;
	/**
	 * 权重
	 */
	private Integer priority;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date lastEditTime;
	/**
	 * 上级ID
	 */
	private ShopCategory parent;

	public Long getShopCategoryId() {
		return shopCategoryId;
	}

	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}

	public String getShopCategoryName() {
		return shopCategoryName;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}

	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}

	public String getShopCategoryImg() {
		return shopCategoryImg;
	}

	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
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

	public ShopCategory getParent() {
		return parent;
	}

	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "ShopCategory [shopCategoryId=" + shopCategoryId + ", shopCategoryName=" + shopCategoryName
				+ ", shopCategoryDesc=" + shopCategoryDesc + ", shopCategoryImg=" + shopCategoryImg + ", priority="
				+ priority + ", createTime=" + createTime + ", lastEditTime=" + lastEditTime + ", parent=" + parent
				+ "]";
	}

	public ShopCategory(Long shopCategoryId, String shopCategoryName, String shopCategoryDesc, String shopCategoryImg,
			Integer priority, Date createTime, Date lastEditTime, ShopCategory parent) {
		super();
		this.shopCategoryId = shopCategoryId;
		this.shopCategoryName = shopCategoryName;
		this.shopCategoryDesc = shopCategoryDesc;
		this.shopCategoryImg = shopCategoryImg;
		this.priority = priority;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
		this.parent = parent;
	}

	public ShopCategory() {
		super();
	}
	
	
}
