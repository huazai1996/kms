package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Sign {
	@Resource
	private Integer id;
	
	private Integer stuId; 
	
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
