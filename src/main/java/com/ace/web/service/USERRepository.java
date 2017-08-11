package com.ace.web.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ace.domain.USER;
import com.ace.domain.XTGN;

@Repository
public interface USERRepository extends JpaRepository<USER, Integer>{
	
	USER findByName(String name);
	USER findById(int id);
	
}
