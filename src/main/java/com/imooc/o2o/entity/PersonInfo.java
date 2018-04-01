package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 用户的实体类
 * 
 * @author Administrator
 *
 */
public class PersonInfo {
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 用户姓名
	 */
	private String name;
	/**
	 * 头像地址
	 */
	private String profileImg;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 性别
 	 */
	private String gender;
	/**
	 * 账户状态 0表示禁止使用,1表示允许使用本商城
	 */
	private Integer enableStatus;
	/**
	 * 身份标识 1.代表顾客 2.代表店家 3.代表超级管理员
	 */
	private Integer userType;
	/**
	 * 用户的身份标识
	 */
	private Date createTime;
	/**
	 * 最后一次操作时间
	 */
	private Date lastEditTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
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

	public PersonInfo(Long userId, String name, String profileImg, String email, String gender, Integer enableStatus,
			Integer userType, Date createTime, Date lastEditTime) {
		super();
		this.userId = userId;
		this.name = name;
		this.profileImg = profileImg;
		this.email = email;
		this.gender = gender;
		this.enableStatus = enableStatus;
		this.userType = userType;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}

	@Override
	public String toString() {
		return "PersonInfo [userId=" + userId + ", name=" + name + ", profileImg=" + profileImg + ", email=" + email
				+ ", gender=" + gender + ", enableStatus=" + enableStatus + ", userType=" + userType + ", createTime="
				+ createTime + ", lastEditTime=" + lastEditTime + "]";
	}

	public PersonInfo() {
		super();
	}

}
