package com.Ace.web.service;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ace.domain.XTGN;

@Repository
public interface XTGNRepository extends JpaRepository<XTGN, Integer> {
	

	XTGN findByName(String name);
	XTGN findById(int id);
	
	List<XTGN> findAllByOrderBySeqXtgnAsc();
//	List<XTGN> findByNameContaining(String nm_xtgn);
}
