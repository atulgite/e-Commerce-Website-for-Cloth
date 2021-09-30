package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Product;
import com.example.demo.entities.ProductAudit;
import com.example.demo.services.ProductService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		return pservice.getAllProducts();
		
	}
	@GetMapping("/getallproductaudit")
	public List<ProductAudit> getAllProductAudit() {
		return pservice.getAllProductAudit();
	}
	@PostMapping("/addproduct")
	public Product save(@RequestBody Product p) {
		return pservice.save(p);
	}

	@GetMapping("/getbyid")
	public List<Product> getByCategoryId(@RequestParam("cid") int cid) {
		return pservice.getByCategoryId(cid);
	}
	@PostMapping("/searchbykeyword")
	public List<Product> searchbykeyword(@RequestBody Product p) {
		return pservice.searchbykeyword(p.getPname(), p.getPbrand(), p.getPdesc());
	}
	@GetMapping("/men")
	public List<Product> getAllMen() {
		return pservice.getAllMen();
	}
	@GetMapping("/women")
	public List<Product> getAllWomen() {
		return pservice.getAllWomen();
	}
	@GetMapping("/viewbyvid")
	public List<Product> getByVid(@RequestParam("vid")int vid){
		return pservice.getByVid(vid);
	}
	@GetMapping("/productstatusaction")
	public void productStatusAction(@RequestParam("pid") int pid,@RequestParam("pprice") float pprice,@RequestParam("pqty") int pqty,@RequestParam("action") String action)
	{
		pservice.productStatusAction(pid,pprice,pqty,action);
	}
	@GetMapping("/vaddproduct")
	public void vaddproduct(@RequestParam("cname") String cname,@RequestParam("ctype")String ctype, @RequestParam("vid") int vid,
			@RequestParam("pname") String pname, @RequestParam("pdesc") String pdesc,
			@RequestParam("psize") String psize, @RequestParam("pbrand") String pbrand,
			@RequestParam("pprice") float pprice, @RequestParam("pqty") int pqty) {
		int cid = pservice.cidReturn(cname, ctype);
		pservice.vaddproduct(cid, vid, pname, pdesc, psize, pbrand, pprice, pqty);
	}
	@GetMapping("/viewoutofstock")
	public List<Product> viewOutOfStock(@RequestParam("vid") int vid)
	{
		return pservice.viewOutOfStock(vid);
	}
}
