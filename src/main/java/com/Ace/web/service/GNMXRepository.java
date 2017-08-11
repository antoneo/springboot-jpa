package com.ace.web.service;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ace.domain.GNMX;

@Repository
public interface GNMXRepository extends JpaRepository<GNMX, Integer> {
	GNMX findByName(String nm_gnmx);
	GNMX findById(int id);
	
	List<GNMX> findAllByOrderBySeqGnmxAsc();
	
//	List<GNMX> findByNameContaining(String name);
}
