package com.anushka.sportyshoes_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anushka.sportyshoes_ecommerce.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	}


