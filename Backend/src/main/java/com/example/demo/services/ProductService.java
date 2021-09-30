package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.entities.ProductAudit;
import com.example.demo.repository.ProductAuditRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prepo;
	@Autowired
	ProductAuditRepository parepo;

	public List<Product> getAllProducts() {
		return prepo.findAll();
	}
	public List<Product> getproducts(int pid)
	{
		return prepo.getproducts(pid);
	}

	public Product save(Product p) {
		return prepo.save(p);
	}

	public List<Product> getByCategoryId(int cid) {
		return prepo.getByCategoryId(cid);
	}
	public List<Product> searchbykeyword(String pname, String pbrand, String pdesc) {
		// TODO Auto-generated method stub
		return prepo.searchbykeyword(pname, pbrand, pdesc);
		
	}
	public List<Product> getAllMen() {
		return prepo.getAllMen();
	}
	public List<Product> getAllWomen() {
		return prepo.getAllWomen();
	}
	public List<Product> getByVid(int vid) {
		return prepo.getByVid(vid);
	}
	public boolean productStatusAction(int pid,float pprice,int pqty,String action) 
	{
		// TODO Auto-generated method stub
		prepo.productAudit(pid);
		if(action.equals("yes"))
		{
			prepo.productadd(pid);
			//prepo.gettotalprice(pid);
			prepo.pdadminwallet(pprice,pqty);
			return true;
		}
		else
		{
			prepo.productdel(pid);
			return false;
		}
		
	}
	public List<ProductAudit> getAllProductAudit() {
		return parepo.getAllprojectaudit();
	}
	public void vaddproduct(int cid, int vid, String pname, String pdesc, String psize, String pbrand, float pprice,
			int pqty) {
		prepo.vaddproduct(cid,vid,pname,pdesc,psize,pbrand,pprice,pqty);
	}
	
	public int cidReturn(String cname,String ctype) {
		return prepo.cidReturn(cname, ctype);
	}
	public List<Product> viewOutOfStock(int vid) {
		// TODO Auto-generated method stub
		return prepo.viewOutOfStock(vid);
	}
}
