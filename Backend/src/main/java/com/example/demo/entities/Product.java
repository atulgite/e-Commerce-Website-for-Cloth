package com.example.demo.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String pname;
	@Column
	private String pdesc;
	// img1 and img2
	@Column
	private String psize;
	@Column
	private int prating;
	@Column
	private int pqty;
	@Column
	private float pprice;
	@Column
	private String pbrand;
	@Column
	private String papprove;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Category cat;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vid")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Vendor vdr;
	
	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<MyOrder> myorders = new ArrayList<MyOrder>();

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, String pdesc, String psize, int prating, int pqty, float pprice, String pbrand,
			String papprove, Category cat, Vendor vdr) {
		super();
		this.pname = pname;
		this.pdesc = pdesc;
		this.psize = psize;
		this.prating = prating;
		this.pqty = pqty;
		this.pprice = pprice;
		this.pbrand = pbrand;
		this.papprove = papprove;
		this.cat = cat;
		this.vdr = vdr;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getPsize() {
		return psize;
	}

	public void setPsize(String psize) {
		this.psize = psize;
	}

	public int getPrating() {
		return prating;
	}

	public void setPrating(int prating) {
		this.prating = prating;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getPapprove() {
		return papprove;
	}

	public void setPapprove(String papprove) {
		this.papprove = papprove;
	}

	public Vendor getVdr() {
		return vdr;
	}

	public void setVdr(Vendor vdr) {
		this.vdr = vdr;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public List<MyOrder> getMyorders() {
		return myorders;
	}

	public void setMyorders(List<MyOrder> myorders) {
		this.myorders = myorders;
	}

	@Override
	public String toString() {
		return "pid";
	}

}
