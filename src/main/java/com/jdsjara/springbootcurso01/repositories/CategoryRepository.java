package com.jdsjara.springbootcurso01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdsjara.springbootcurso01.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
