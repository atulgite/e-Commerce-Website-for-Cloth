package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Vendor;
import com.example.demo.entities.VendorAudit;
import com.example.demo.services.VendorService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VendorController {
	@Autowired
	VendorService vservice;

	@GetMapping("/getallvendor")
	public List<Vendor> getAllVendor() {
		return vservice.getAllVendor();
	}
	@GetMapping("/getallvendoraudit")
	public List<VendorAudit> getAllVendorAudit() {
		return vservice.getAllVendorAudit();
	}
	@PostMapping("/registervendor")
	public Vendor saveVendor(@RequestBody Vendor v) {
		return vservice.registerVendor(v);
	}

	@GetMapping("/loginvendor")
	public Vendor logincheck(@RequestParam("vemail")  String vemail,@RequestParam("vpassword") String vpassword) {
		return vservice.loginVendor(vemail,vpassword);
	}
	@GetMapping("/vendorstatusaction")
	public void vendorStatusAction(@RequestParam("vid") int vid,@RequestParam("action") String action)
	{
		vservice.vendorStatusAction(vid,action);
	}
}
