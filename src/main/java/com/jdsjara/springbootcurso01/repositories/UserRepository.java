package com.jdsjara.springbootcurso01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdsjara.springbootcurso01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
