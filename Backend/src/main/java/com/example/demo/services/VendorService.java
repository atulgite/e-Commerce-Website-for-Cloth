package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Vendor;
import com.example.demo.entities.VendorAudit;
import com.example.demo.repository.VendorAuditRepository;
import com.example.demo.repository.VendorRepository;

@Service
public class VendorService {
	@Autowired
	VendorRepository vrepo;
	@Autowired
	VendorAuditRepository varepo;

	public List<Vendor> getAllVendor() {
		return vrepo.findAll();
	}

	public List<VendorAudit> getAllVendorAudit() {
		return varepo.getAllvendoraudit();
	}

	public Vendor registerVendor(Vendor v) {
		return vrepo.save(v);
	}

	public Vendor loginVendor(String vemail, String vpassword) {
		Vendor v = vrepo.loginVendor(vemail, vpassword);
		if (v != null) {
			System.out.println("true");
			return v;
		} else {
			System.out.println("false");
			return null;
		}

	}

	public boolean vendorStatusAction(int vid, String action) {
		// TODO Auto-generated method stub
		vrepo.vendorAudit(vid);
		if (action.equals("yes")) {
			vrepo.vendoradd(vid);
			return true;
		} else {
			vrepo.vendordel(vid);
			return false;
		}

	}

}
