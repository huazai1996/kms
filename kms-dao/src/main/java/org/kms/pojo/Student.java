package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Student {
	@Resource
	private Integer id;
	
	private String stuNumber;
	
	private String stuName;
	
	private Integer gradeid;
	
	private String address;
	
	private Date birthday;
	
	private Integer gender;
	
	private Integer state;
	
	private Date parkDate;
	
	private Integer tuition;
	
	private Integer foodfee;
	
	private Integer costid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getGradeid() {
		return gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getParkDate() {
		return parkDate;
	}

	public void setParkDate(Date parkDate) {
		this.parkDate = parkDate;
	}

	public Integer getTuition() {
		return tuition;
	}

	public void setTuition(Integer tuition) {
		this.tuition = tuition;
	}

	public Integer getFoodfee() {
		return foodfee;
	}

	public void setFoodfee(Integer foodfee) {
		this.foodfee = foodfee;
	}

	public Integer getCostid() {
		return costid;
	}

	public void setCostid(Integer costid) {
		this.costid = costid;
	}
	
}
