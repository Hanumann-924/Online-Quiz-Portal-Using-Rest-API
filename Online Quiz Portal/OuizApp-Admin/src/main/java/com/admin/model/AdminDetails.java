package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aId;
	@Column(nullable = false)
	private String auname;
	@Column(nullable = false)
	private String apass;
	
	
	
	public AdminDetails() {
		
	}
	private String accessToken;
	public AdminDetails(long aId, String auname, String apass) {
		super();
		this.aId = aId;
		this.auname = auname;
		this.apass = apass;
	}
	public long getaId() {
		return aId;
	}
	public void setaId(long aId) {
		this.aId = aId;
	}
	public String getauname() {
		return auname;
	}
	public void setauname(String auname) {
		this.auname = auname;
	}
	public String getaPass() {
		return apass;
	}
	public void setaPass(String apass) {
		this.apass = apass;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}

