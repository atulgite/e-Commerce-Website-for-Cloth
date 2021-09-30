package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column
	private String upassword;
	@Column
	private String ufname;
	@Column
	private String ulname;
	@Column
	private String uemail;
	@Column
	private String uaddress;
	@Column
	private String ucontactno;
	@Column
	private float uwallet=2000f;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cust")
//	private MyOrder mo;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String upassword, String ufname, String ulname, String uemail, String uaddress, String ucontactno) {
		super();
		this.upassword = upassword;
		this.ufname = ufname;
		this.ulname = ulname;
		this.uemail = uemail;
		this.uaddress = uaddress;
		this.ucontactno = ucontactno;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUfname() {
		return ufname;
	}

	public void setUfname(String ufname) {
		this.ufname = ufname;
	}

	public String getUlname() {
		return ulname;
	}

	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUcontactno() {
		return ucontactno;
	}

	public void setUcontactno(String ucontactno) {
		this.ucontactno = ucontactno;
	}

	public float getUwallet() {
		return uwallet;
	}

	public void setUwallet(float uwallet) {
		this.uwallet = uwallet;
	}

}
