package com.anushka.sportyshoes_ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import com.anushka.sportyshoes_ecommerce.entity.Product;



public interface CartRepository extends CrudRepository<Product, Long> {


	

	
}
