package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	@Column
	private int uniqueid;
	@Column
	private String vpassword;
	@Column
	private String vfname;
	@Column
	private String vlname;
	@Column
	private String vcontactno;
	@Column
	private String vaddress;
	@Column
	private String vemail;
	@Column
	private float vwallet=500f;
	@Column
	private String vstatus = "false";

	@OneToMany(mappedBy = "vdr", cascade = CascadeType.ALL)
	List<Product> products;

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int uniqueid, String vpassword, String vfname, String vlname, String vcontactno, String vaddress,
			String vemail, float vwallet, String vstatus) {
		super();
		this.uniqueid = uniqueid;
		this.vpassword = vpassword;
		this.vfname = vfname;
		this.vlname = vlname;
		this.vcontactno = vcontactno;
		this.vaddress = vaddress;
		this.vemail = vemail;
		this.vwallet = vwallet;
		this.vstatus = vstatus;
	}

	public Vendor(int uniqueid, String vpassword, String vfname, String vlname, String vcontactno, String vaddress,
			String vemail, float vwallet, String vstatus, List<Product> products) {
		super();
		this.uniqueid = uniqueid;
		this.vpassword = vpassword;
		this.vfname = vfname;
		this.vlname = vlname;
		this.vcontactno = vcontactno;
		this.vaddress = vaddress;
		this.vemail = vemail;
		this.vwallet = vwallet;
		this.vstatus = vstatus;
		this.products = products;
	}

	public Vendor(int uniqueid, String vpassword, String vfname, String vlname, String vcontactno, String vaddress,
			String vemail) {
		super();
		this.uniqueid = uniqueid;
		this.vpassword = vpassword;
		this.vfname = vfname;
		this.vlname = vlname;
		this.vcontactno = vcontactno;
		this.vaddress = vaddress;
		this.vemail = vemail;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getVpassword() {
		return vpassword;
	}

	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}

	public String getVfname() {
		return vfname;
	}

	public void setVfname(String vfname) {
		this.vfname = vfname;
	}

	public String getVlname() {
		return vlname;
	}

	public void setVlname(String vlname) {
		this.vlname = vlname;
	}

	public String getVcontactno() {
		return vcontactno;
	}

	public void setVcontactno(String vcontactno) {
		this.vcontactno = vcontactno;
	}

	public String getVaddress() {
		return vaddress;
	}

	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}

	public String getVemail() {
		return vemail;
	}

	public void setVemail(String vemail) {
		this.vemail = vemail;
	}

	public float getVwallet() {
		return vwallet;
	}

	public void setVwallet(float vwallet) {
		this.vwallet = vwallet;
	}

	public String getVstatus() {
		return vstatus;
	}

	public void setVstatus(String vstatus) {
		this.vstatus = vstatus;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		for (Product p : products)
			p.setVdr(this);
	}

}
