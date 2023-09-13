package com.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.crud.model.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO student (name, address) VALUES (?, ?)";
		int i = jdbcTemplate.update(sql, student.getName(), student.getAddress());
		return i;
	}

	@Override
	public int updateDetail(Student student) {
		// TODO Auto-generated method stub
		String sql = "UPDATE student SET name = ?, address = ? WHERE id = ?";
		int i = jdbcTemplate.update(sql, student.getName(), student.getAddress());
		return i;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id = ? ";
		int i = jdbcTemplate.update(sql, 3);
		return 0;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id = ?";
		RowMapper rowMapper = new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}

		};

		Student st = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		RowMapper rowMapper = new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}

		};
		
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		return null;
	}

}
