package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Generate {
	@Resource
	private Integer id;
	
	private Date month;
	
	private Integer gradeId;
	
	private Integer state;
	
	private Integer toAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getToAmount() {
		return toAmount;
	}

	public void setToAmount(Integer toAmount) {
		this.toAmount = toAmount;
	}
	
}
