package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.MyOrder;
import com.example.demo.repository.MyOrderRepository;

@Service
public class MyOrderService {
	@Autowired
	MyOrderRepository morepo;

	public List<MyOrder> getAllMyOrders() {
		return morepo.findAll();
		// final Optional<Product> pro = prepo.getproduct();
		// MyOrder o = new MyOrder();
		/*
		 * o.setFirstName(pro.get().getPname()); p.setLastName(pro.get().getLastName());
		 * p.setId(pro.get().getId()); p.setSubjects(pro.get().getSubjects()); return s;
		 */
	}

	public void deductQty(int pid) {
		morepo.deductQty(pid);
	}

	public MyOrder addMyOrder(MyOrder mo) {
		float price = mo.getTotalprice();
		int uid = mo.getUid();
		MyOrder m = morepo.save(mo);
		morepo.addToAwallet(price);
		morepo.deducUwallet(price, uid);
		morepo.getpidaudit();
		morepo.deletepidaudit();
		return m;
	}

	public Optional<MyOrder> findById(int oid) {
		return morepo.findById(oid);
	}

	public List<MyOrder> findAll() {
		if (morepo.findAll() != null) {
			return morepo.findAll();
		} else
			return null;
	}

	public List<MyOrder> getOrderDataFromUid(int uid) {

		return morepo.getOrderDataFromUid(uid);
	}
}