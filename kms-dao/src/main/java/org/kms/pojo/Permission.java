package org.kms.pojo;

import javax.annotation.Resource;

public class Permission {
	@Resource
	private Integer id;
	
	private String perName;
	
	private String perType;
	
	private String url;
	
	private String perCode;
	
	private Integer parented;
	
	private Integer available;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getPerType() {
		return perType;
	}

	public void setPerType(String perType) {
		this.perType = perType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPerCode() {
		return perCode;
	}

	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}

	public Integer getParented() {
		return parented;
	}

	public void setParented(Integer parented) {
		this.parented = parented;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}
	
}
