package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 本地账号
 * @author Administrator
 *
 */
public class LoaclAuth {
	//ID
	private Long localAuthId;
	//用户名
	private String username;
	//密码
	private String password;
	//创建时间
	private Date creteTime;
	//修改时间
	private Date lastEditTime;
	//用户的实体类
	private PersonInfo personInfo;
	public Long getLocalAuthId() {
		return localAuthId;
	}
	public void setLocalAuthId(Long localAuthId) {
		this.localAuthId = localAuthId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreteTime() {
		return creteTime;
	}
	public void setCreteTime(Date creteTime) {
		this.creteTime = creteTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	@Override
	public String toString() {
		return "LoaclAuth [localAuthId=" + localAuthId + ", username=" + username + ", password=" + password
				+ ", creteTime=" + creteTime + ", lastEditTime=" + lastEditTime + ", personInfo=" + personInfo + "]";
	}
	public LoaclAuth(Long localAuthId, String username, String password, Date creteTime, Date lastEditTime,
			PersonInfo personInfo) {
		super();
		this.localAuthId = localAuthId;
		this.username = username;
		this.password = password;
		this.creteTime = creteTime;
		this.lastEditTime = lastEditTime;
		this.personInfo = personInfo;
	}
	public LoaclAuth() {
		super();
	}
	
	
}
