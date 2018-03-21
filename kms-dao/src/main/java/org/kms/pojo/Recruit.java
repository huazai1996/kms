package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Recruit {
	@Resource
	private Integer id;
	
	private String name;
	
	private Date birthday;
	
	private Integer gender;
	
	private Date estimateparkdate;
	
	private String phone;
	
	private Integer refund;
	
	private Integer teaId;
	
	private Teacher teacher;
	

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getEstimateparkdate() {
		return estimateparkdate;
	}

	public void setEstimateparkdate(Date estimateparkdate) {
		this.estimateparkdate = estimateparkdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRefund() {
		return refund;
	}

	public void setRefund(Integer refund) {
		this.refund = refund;
	}

	public Integer getTeaId() {
		return teaId;
	}

	public void setTeaId(Integer teaId) {
		this.teaId = teaId;
	}

	
	
}
