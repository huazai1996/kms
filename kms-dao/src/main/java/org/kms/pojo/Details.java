package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Details {
	@Resource
	private Integer id;
	
	private Integer gradeId;
	
	private Date month;
	
	private Integer toAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getToAmount() {
		return toAmount;
	}

	public void setToAmount(Integer toAmount) {
		this.toAmount = toAmount;
	}
	
	
}
