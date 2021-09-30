package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.VendorAudit;

@Repository
public interface VendorAuditRepository extends JpaRepository<VendorAudit, Integer> {
	
	@Query(value="select * from vendoraudit order by vtime desc",nativeQuery = true)
	public List<VendorAudit> getAllvendoraudit();
}