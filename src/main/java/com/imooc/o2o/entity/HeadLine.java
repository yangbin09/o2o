package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 头条的实体类
 * 
 * @author Administrator
 *
 */
public class HeadLine {
	// ID
	private Long lineId;
	// 名字
	private String lineName;
	// 链接地址
	private String lineLink;
	// 图片地址
	private Integer lineImg;
	// 权重
	private Integer priority;
	// 0.不可用 1.可用
	private String enableStatus;
	// 创建时间
	private Date createTime;
	// 修改时间
	private Date lastEditTime;

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLineLink() {
		return lineLink;
	}

	public void setLineLink(String lineLink) {
		this.lineLink = lineLink;
	}

	public Integer getLineImg() {
		return lineImg;
	}

	public void setLineImg(Integer lineImg) {
		this.lineImg = lineImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
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

	@Override
	public String toString() {
		return "HeadLine [lineId=" + lineId + ", lineName=" + lineName + ", lineLink=" + lineLink + ", lineImg="
				+ lineImg + ", priority=" + priority + ", enableStatus=" + enableStatus + ", createTime=" + createTime
				+ ", lastEditTime=" + lastEditTime + "]";
	}

	public HeadLine(Long lineId, String lineName, String lineLink, Integer lineImg, Integer priority,
			String enableStatus, Date createTime, Date lastEditTime) {
		super();
		this.lineId = lineId;
		this.lineName = lineName;
		this.lineLink = lineLink;
		this.lineImg = lineImg;
		this.priority = priority;
		this.enableStatus = enableStatus;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}

	public HeadLine() {
		super();
	}

}
