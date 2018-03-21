package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Inex {
	@Resource
	private Integer id;
	
	private Date accounting;
	
	private String income;
	
	private Integer inamout;
	
	private Integer schoolId;
	
	private Integer state;
	
	private String founder;
	
	private String approval;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAccounting() {
		return accounting;
	}

	public void setAccounting(Date accounting) {
		this.accounting = accounting;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public Integer getInamout() {
		return inamout;
	}

	public void setInamout(Integer inamout) {
		this.inamout = inamout;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
	
}
