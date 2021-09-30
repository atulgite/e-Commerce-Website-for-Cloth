package com.example.demo.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value = "select * from product where cid=?1", nativeQuery = true)
	public List<Product> getByCategoryId(int cid);

	@Query(value = "select * from product where pname like (%?1%) or pbrand like (%?1%) or pdesc like (%?1%)", nativeQuery = true)
	public List<Product> searchbykeyword(String pname, String pbrand, String pdesc);

	@Query(value = "select * from product where cid in(select cid from category where ctype='M')", nativeQuery = true)
	public List<Product> getAllMen();

	@Query(value = "select * from product where cid in(select cid from category where ctype='F')", nativeQuery = true)
	public List<Product> getAllWomen();

	@Query(value = "select * from product where vid = ?1", nativeQuery = true)
	public List<Product> getByVid(int vid);

	@Modifying
	@Query(value = "delete from productaudit where pid=?1", nativeQuery = true)
	public void productAudit(int pid);

	@Modifying
	@Query(value = "update product set papprove='true', pprice=pprice + pprice*0.1 where pid=?1", nativeQuery = true)
	public void productadd(int pid);

	@Modifying
	@Query(value = "delete from product where pid=?1", nativeQuery = true)
	public void productdel(int pid);

	@Query(value = "select cid from category where cname=?1 AND ctype=?2", nativeQuery = true)
	public int cidReturn(String cname, String ctype);

	@Modifying
	@Query(value = "insert into product(cid,vid,pname,pdesc,psize,pbrand,pprice,pqty)	values(?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
	public void vaddproduct(int cid, int vid, String pname, String pdesc, String psize, String pbrand, float pprice,
			int pqty);

	@Query(value = "select * from product where pqty=0 AND vid=?1", nativeQuery = true)
	public List<Product> viewOutOfStock(int vid);

	@Query(value = "select * from product where pid=?1", nativeQuery = true)
	public List<Product> getproducts(int pid);

	@Modifying
	@Query(value = "update admin set awallet=awallet-(?1*?2) where adminid=121", nativeQuery = true)
	public void pdadminwallet(float pprice, int pqty);

}
