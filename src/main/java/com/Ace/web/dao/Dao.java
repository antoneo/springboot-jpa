package com.Ace.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class Dao {
	@Autowired
	private LocalContainerEntityManagerFactoryBean emf;
	
	public List query(String sql){
		EntityManager em=emf.getNativeEntityManagerFactory().createEntityManager();
		Query query=em.createNativeQuery("select * from spi_gnmx");
		return query.getResultList();
	}
}
