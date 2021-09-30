package com.example.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Vendor;

@Transactional
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

	@Query(value = "select * from vendor where vemail = ?1 and vpassword = ?2", nativeQuery = true)
	public Vendor loginVendor(String vemail, String vpassword);
	@Modifying
	@Query(value="delete from vendoraudit where vid=?1",nativeQuery = true)
	public void vendorAudit(int vid);
	
	@Modifying
	@Query(value="update vendor set vstatus='true' where vid=?1",nativeQuery = true)
	public void vendoradd(int vid);	
	@Modifying
	@Query(value="delete from vendor where vid=?1",nativeQuery = true)
	public void vendordel(int vid);	
	
	
}
