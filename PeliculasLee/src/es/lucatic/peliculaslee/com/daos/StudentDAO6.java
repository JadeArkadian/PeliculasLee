package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import beans.Student;
import utilities.StudentMapper;

public class StudentDAO6 implements IStudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void insert(Student student) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		try {
			jdbcTemplateObject.update(SQL, student.getName(), student.getAge());
			System.out.println("Created Record Name = " + student.getName()
					+ " Age = " + student.getAge());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public Student findById(Student student) {
		Student studentaux = null;
		try {
			String SQL = "select * from Student where id = ?";
			System.out.println("antes" + student.getId());
			studentaux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { student.getId() }, new StudentMapper());
			System.out.println("desp");
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return studentaux;
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = null;
		try {
			students = jdbcTemplateObject.query(SQL, new StudentMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return students;
	}

	public void delete(Student student) {
		String SQL = "delete from Student where id = ?";
		try {
			jdbcTemplateObject.update(SQL, student.getId());
			System.out.println("Deleted Record with ID = " + student.getId());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void update(Student student) {
		String SQL = "update Student set age = ? where id = ?";
		try {
			jdbcTemplateObject.update(SQL, student.getAge(), student.getId());
			System.out.println("Updated Record with ID = " + student.getId());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
