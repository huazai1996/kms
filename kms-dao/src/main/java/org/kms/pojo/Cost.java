package org.kms.pojo;

import java.sql.Date;

import javax.annotation.Resource;

public class Cost {
	@Resource
	private Integer id;
	
	private String titile;
	
	private String costName;
	
	private String costType;
	
	private Integer costprice;
	
	private String costmode;
	
	private Date establish;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getCostName() {
		return costName;
	}

	public void setCostName(String costName) {
		this.costName = costName;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	public Integer getCostprice() {
		return costprice;
	}

	public void setCostprice(Integer costprice) {
		this.costprice = costprice;
	}

	public String getCostmode() {
		return costmode;
	}

	public void setCostmode(String costmode) {
		this.costmode = costmode;
	}

	public Date getEstablish() {
		return establish;
	}

	public void setEstablish(Date establish) {
		this.establish = establish;
	}
	
}
