package com.jdsjara.springbootcurso01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdsjara.springbootcurso01.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
