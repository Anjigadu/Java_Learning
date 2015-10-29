package com.prakash.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prakash.mdel.Circle;

@Component
public class JdbcDaoImpl {
	
	@Autowired
	private DataSource dataSource;
	

	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public Circle getCircle(int circleId) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		
		Connection conn = null;
//		
//		String driver = "org.postgresql.Driver";
//		
//		Class.forName(driver).newInstance();
//		
//		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HibernateStudy", "postgres", "Dell@123");
//		
		conn = dataSource.getConnection();
		System.out.println("============ Connecetion made=============");
		
//		Statement stmt = conn.createStatement();
//		
//		String sql = "CREATE TABLE CIRCLE " +
//                 "(id INTEGER not NULL, " +
//                 " name VARCHAR(255), " +
//                 " PRIMARY KEY ( id ))"; 
//		
//		stmt.execute(sql);
//		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id = ?");
		
		ps.setInt(1, circleId);
		
		Circle circle = null;
		ResultSet  rs = ps.executeQuery();
		
		if(rs.next()){
			circle = new Circle(circleId, rs.getString("name"));
		}
		
		rs.close();;
		ps.close();
		conn.close();
		return circle;
		
		
		

	}

}
