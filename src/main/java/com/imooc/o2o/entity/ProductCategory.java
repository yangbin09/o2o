package com.imooc.o2o.entity;

import java.util.Date;
/**
 * 商品类别
 * @author Administrator
 *
 */
public class ProductCategory {
	/**
	 * 商品的ID
	 */
	private Long productCategoryId;
	/**
	 * 店铺ID
	 */
	private Long shopId;
	/**
	 * 商品类别的名称
	 */
	private String productCategoryName;
	/**
	 * 权重
	 */
	private Integer priority;
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
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

	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", shopId=" + shopId
				+ ", productCategoryName=" + productCategoryName + ", priority=" + priority + ", createTime="
				+ createTime + "]";
	}

	public ProductCategory(Long productCategoryId, Long shopId, String productCategoryName, Integer priority,
			Date createTime) {
		super();
		this.productCategoryId = productCategoryId;
		this.shopId = shopId;
		this.productCategoryName = productCategoryName;
		this.priority = priority;
		this.createTime = createTime;
	}

	public ProductCategory() {
		super();
	}

	
}
