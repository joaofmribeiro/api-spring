package com.springtest.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
