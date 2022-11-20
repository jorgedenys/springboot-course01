package com.jdsjara.springbootcurso01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdsjara.springbootcurso01.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
