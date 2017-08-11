package com.Ace;

import java.lang.ProcessBuilder.Redirect;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.Ace.web.dao.Dao;

@Aspect
@Component
@Order(1)
public class LoginAspect {
	private Logger log = Logger.getLogger(getClass());
	@Autowired
	private JdbcTemplate jdbc;
	
//	@Pointcut("execution(public * com.Ace.web.controller.*.*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	@Pointcut("execution(public * com.Ace.web.controller.IndexController.*(..))")
	public void pointCut() {
	}

	@Around("pointCut()")
	public Object trackInfo(ProceedingJoinPoint pjp) throws Throwable {
		log.info("切面。。。");
		jdbc.execute("CREATE TABLE `spi_text` ( `ID_GNMX` int(11) NOT NULL,`ID_XTGN` int(11) DEFAULT NULL,`NM_GNMX` varchar(20) NOT NULL,`URL_GNMX` varchar(50) DEFAULT NULL,`SEQ_GNMX` int(11) DEFAULT NULL,`ICO_GNMX` varchar(20) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8;");
		//jpa中使用sql
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra = (ServletRequestAttributes) ra;
		HttpServletRequest request = sra.getRequest();
		HttpServletResponse response = sra.getResponse();
		if (isLogin(request)) {
			response.sendRedirect(request.getContextPath()+"/login");
		}

		return pjp.proceed();
	}

	private boolean isLogin(HttpServletRequest request) {
		//控制登录
		return true;
	}
}
