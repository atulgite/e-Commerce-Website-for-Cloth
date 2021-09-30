package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	private int adminid;
	@Column
	private String apassword;
	@Column
	private float awallet;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminid, String apassword, float awallet) {
		super();
		this.adminid = adminid;
		this.apassword = apassword;
		this.awallet = awallet;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

	public float getAwallet() {
		return awallet;
	}

	public void setAwallet(float awallet) {
		this.awallet = awallet;
	}

}
