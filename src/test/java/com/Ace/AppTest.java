package com.ace;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ace.web.service.XTGNRepository;

public class AppTest {
	@Autowired
	private XTGNRepository xtgn;
	
	@Test
	public void test() throws Exception {
		System.out.println(xtgn.findByName("权限管理"));
	}
}