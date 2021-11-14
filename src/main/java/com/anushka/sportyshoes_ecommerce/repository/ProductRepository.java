package com.anushka.sportyshoes_ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.anushka.sportyshoes_ecommerce.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	

	
}
