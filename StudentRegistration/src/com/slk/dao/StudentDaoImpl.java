package com.slk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.slk.entity.Student;
import com.slk.util.Dbutil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student addStudent(Student student) throws DaoException {
		String sql = "Insert into student(firstname, lastname, email, phone, city, state, course) values(?,?,?,?,?,?,?);";
		try (Connection conn = Dbutil.getconnection();
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

			stmt.setString(1, student.getFirstname());
			stmt.setString(2, student.getLastname());
			stmt.setString(3, student.getemail());
			stmt.setString(4, student.getPhone());
			stmt.setString(5, student.getCity());

			stmt.setString(6, student.getState());
			stmt.setString(7, student.getCourse());

			stmt.executeUpdate();

			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			Integer id = keys.getInt(1);
			student.setId(id);
			return student;

		} catch (SQLException | ClassNotFoundException e) {
			throw new DaoException(e);

		}

	}

	@Override
	public List<Student> getAll() throws DaoException {
		String sql = " select * from student";
		try (Connection conn = Dbutil.getconnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();) {

			List<Student> student = new ArrayList<Student>();
			while (rs.next()) {

				Student s = StudentResultSet(rs);
				student.add(s);
			}

			return student;
		} catch (SQLException | ClassNotFoundException e) {
			throw new DaoException(e);
		}
	}

	private Student StudentResultSet(ResultSet rs) throws SQLException {
		Student s = new Student();
		s.setId(rs.getInt("id"));
		s.setFirstname(rs.getString("firstname"));
		s.setLastname(rs.getString("lastname"));
		s.setemail(rs.getString("email"));
		s.setPhone(rs.getString("phone"));
		s.setCity(rs.getString("city"));
		s.setState(rs.getString("state"));
		s.setCourse(rs.getString("course"));
		return s;
	}

	@Override
	public Student GetStudentById(int id) throws DaoException {
		String sql = "select * from student where id=?";
		try (Connection conn = Dbutil.getconnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery();) {
				if (rs.next()) {
					return StudentResultSet(rs);
				}
			}

		} catch (SQLException | ClassNotFoundException e) {
			throw new DaoException(e);
		}
		return null;

	}

	@Override
	public Student UpdateStudent(Student student) throws DaoException {
		String sql = "update student set firstname=? ,lastname=? ,email=?,phone=?,city=?,state=?,course=? where id=?";
		try (Connection conn = Dbutil.getconnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, student.getId());
			stmt.setString(2, student.getFirstname());
			stmt.setString(3, student.getLastname());
			stmt.setString(4, student.getemail());
			stmt.setString(5, student.getPhone());
			stmt.setString(6, student.getCity());

			stmt.setString(7, student.getState());
			stmt.setString(8, student.getCourse());
			stmt.setInt(8, student.getId());
			stmt.executeUpdate();
			return student;
		} catch (SQLException | ClassNotFoundException e) {
			throw new DaoException(e);
		}

	}

}
