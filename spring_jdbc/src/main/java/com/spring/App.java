package com.spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.crud.dao.StudentDao;
import com.crud.model.Student;

public class App {
	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
//		JdbcTemplate jt = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
//		System.out.println(jt);
//		System.out.println(jt.getDataSource().getConnection());
		
//		// insert query
//		String sql = "INSERT INTO student (name, address) VALUES (?, ?)";
//
//		
//		int i = jt.update(sql, "pooja", "Bhopal");
//		
//		System.out.println("success" + i);
		
		// // update query
//		String sql = "UPDATE student SET name = ?, address = ? WHERE id = ?";
//		int i = jt.update(sql, "puja" , "morya" , 1);
//		System.out.println("update successfully" + i);	
		
		
		// // delete query
		
//		String sql = "delete from student where id = ? ";
//		int i = jt.update(sql, 1);
//		System.out.print("delete successfullt  " + i);
		
		// // select query 
		
//		String sql = "select * from student";
//		int i = jt.update(sql);
//		
//		RowMapper rowMapper = new RowMapper() {
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//				Student st = new Student();
//				st.setId(rs.getInt(1));
//				st.setName(rs.getString(2));
//				st.setAddress(rs.getString(3));
//				return st;
//			}
//
//		};
//		System.out.println("fatch row " + i);
		
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		Student st = new Student();
		st.setName("arch");
		st.setAddress("up");
		
		int i = dao.insert(st);
		
		System.out.println("insert successfully " + i);
		
	}
}
