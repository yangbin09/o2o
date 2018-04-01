package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author 作者 E-mail: 百年叔叔 1692207904@qq.com
 * @version 创建时间：2017年12月30日 下午12:40:56
 * 类说明 ：错误日志整理类
 */

public class MistakeLog {
	/**
	 * ID
	 */
	private Integer MistakeLogId;
    /**
     *   创建时间
     */
	private Date createTime;
    /**
     * 发生操作的表名
      */
	private String tableName;
    /**
     *  原因
     */
	private String mistakeCause;
    /**
     *  记录
     */
	private String ramarks;


	public Integer getAreaId() {
		return MistakeLogId;
	}

	public void setAreaId(Integer MistakeLogId) {
		this.MistakeLogId = MistakeLogId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getMistakeCause() {
		return mistakeCause;
	}

	public void setMistakeCause(String mistakeCause) {
		this.mistakeCause = mistakeCause;
	}

	public String getRamarks() {
		return ramarks;
	}

	public void setRamarks(String ramarks) {
		this.ramarks = ramarks;
	}

	@Override
	public String toString() {
		return "MistakeLog [MistakeLogId=" + MistakeLogId + ", createTime=" + createTime + ", tableName=" + tableName
				+ ", mistakeCause=" + mistakeCause + ", ramarks=" + ramarks + "]";
	}

	public MistakeLog(Integer MistakeLogId, Date createTime, String tableName, String mistakeCause, String ramarks) {
		super();
		this.MistakeLogId = MistakeLogId;
		this.createTime = createTime;
		this.tableName = tableName;
		this.mistakeCause = mistakeCause;
		this.ramarks = ramarks;
	}

	public MistakeLog() {
		super();
	}

}
