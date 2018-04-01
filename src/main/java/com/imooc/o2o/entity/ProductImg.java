package com.imooc.o2o.entity;

import java.util.Date;
/**
 * 详情图片
 * @author Administrator
 *
 */
public class ProductImg {
	/**
	 * 图片Id
	 */
	private Long productImgId;
	/**
	 * 图片地址
	 */
	private String imgAddr;
	/**
	 * 图片的说明
	 */
	private String imgDesc;
	/**
	 * 图片的权重
	 */
	private Integer priority;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 属于哪个商品
	 */
	private Long productId;

	public Long getProductImgId() {
		return productImgId;
	}

	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}

	public String getImgAddr() {
		return imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	public String getImgDesc() {
		return imgDesc;
	}

	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductImg [productImgId=" + productImgId + ", imgAddr=" + imgAddr + ", imgDesc=" + imgDesc
				+ ", priority=" + priority + ", createTime=" + createTime + ", productId=" + productId + "]";
	}

	public ProductImg(Long productImgId, String imgAddr, String imgDesc, Integer priority, Date createTime,
			Long productId) {
		super();
		this.productImgId = productImgId;
		this.imgAddr = imgAddr;
		this.imgDesc = imgDesc;
		this.priority = priority;
		this.createTime = createTime;
		this.productId = productId;
	}

	public ProductImg() {
		super();
	}
	
}
