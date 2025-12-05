package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ust.demo.model.Product;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String category);
	
//	@Query(value="select p from Product p where p.price between :min and :max", nativeQuery = false)
	@Query("select p from Product p where p.price between :min and :max")
	List<Product> findByPriceRange(@Param("min") Double min,@Param("max") Double max);
}
