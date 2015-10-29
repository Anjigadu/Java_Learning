package com.prakash.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.prakash.mdel.Circle;

@Component
public class JdbcDaoImpl {

	//@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	//private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbcTemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbcTemplate = jdbctemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; // this is only used in getCircle method. If we change this method same as getCircleCount method, this line is not required.
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Circle getCircle(int circleId) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {

		Connection conn = null;
		//
		// String driver = "org.postgresql.Driver";
		//
		// Class.forName(driver).newInstance();
		//
		// conn =
		// DriverManager.getConnection("jdbc:postgresql://localhost:5432/HibernateStudy",
		// "postgres", "Dell@123");
		//
		conn = dataSource.getConnection();
		System.out.println("============ Connecetion made=============");

		// Statement stmt = conn.createStatement();
		//
		// String sql = "CREATE TABLE CIRCLE " +
		// "(id INTEGER not NULL, " +
		// " name VARCHAR(255), " +
		// " PRIMARY KEY ( id ))";
		//
		// stmt.execute(sql);
		//
		PreparedStatement ps = conn
				.prepareStatement("SELECT * FROM circle where id = ?");

		ps.setInt(1, circleId);

		Circle circle = null;
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			circle = new Circle(circleId, rs.getString("name"));
		}

		rs.close();
		;
		ps.close();
		conn.close();
		return circle;

	}

	public int getCircleCount() {
		String sql = "SELECT COUNT(*) FROM CIRCLE";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForInt(sql);
	}

}
