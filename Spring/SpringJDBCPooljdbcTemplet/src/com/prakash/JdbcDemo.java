package com.prakash;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prakash.dao.JdbcDaoImpl;
import com.prakash.mdel.Circle;

public class JdbcDemo {

	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		//Circle circle = new JdbcDaoImpl().getCircle(1);
		
		//System.out.print(circle.getName());
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);	
		
		Circle circle = dao.getCircle(1);
		System.out.println(circle.getName());
	
		System.out.println("===================Output from JdbcTemplate================");
		
		System.out.println(dao.getCircleCount());
		
		
	}
	
}
