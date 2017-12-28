package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 微信账号的实体类
 * @author Administrator
 *
 */
public class WechatAuth {
	//ID
	private long wechatAuthId;
	//微信的ID
	private String openId;
	//创建时间
	private Date createTime;
	
	private PersonInfo personInfo;

	public long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "WechatAuth [wechatAuthId=" + wechatAuthId + ", openId=" + openId + ", createTime=" + createTime
				+ ", personInfo=" + personInfo + "]";
	}

	public WechatAuth(long wechatAuthId, String openId, Date createTime, PersonInfo personInfo) {
		super();
		this.wechatAuthId = wechatAuthId;
		this.openId = openId;
		this.createTime = createTime;
		this.personInfo = personInfo;
	}

	public WechatAuth() {
		super();
	}
	
	
}
