package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.interfaces.daos.IComentariosDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.ComentariosMapper;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;



public class ComentariosDAO implements IComentariosDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<ComentariosDAO> listComentarioss() {
		String SQL =queriesDB.findAllComentariosQuery;
		List<ComentariosDAO> comentarios = null;
		try {
			comentarios = jdbcTemplateObject.query(SQL, new ComentariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return comentarios;
	}
	public void insert(ComentariosDAO comentario) {
		String SQL = "insert into Comentarios (name, age) values (?, ?)";
		try {
			jdbcTemplateObject.update(SQL, comentario.getName(), comentario.getAge());
			System.out.println("Created Record Name = " + comentario.getName()
					+ " Age = " + comentario.getAge());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public ComentariosDAO findById(ComentariosDAO comentario) {
		ComentariosDAO comentarioaux = null;
		try {
			String SQL = "select * from Comentarios where id = ?";
			System.out.println("antes" + comentario.getId());
			comentarioaux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { comentario.getId() }, new ComentariosMapper());
			System.out.println("desp");
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return comentarioaux;
	}

	

	public void delete(ComentariosDAO comentario) {
		String SQL = "delete from Comentarios where id = ?";
		try {
			jdbcTemplateObject.update(SQL, comentario.getId());
			System.out.println("Deleted Record with ID = " + comentario.getId());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void update(ComentariosDAO comentario) {
		String SQL = "update Comentarios set age = ? where id = ?";
		try {
			jdbcTemplateObject.update(SQL, comentario.getAge(), comentario.getId());
			System.out.println("Updated Record with ID = " + comentario.getId());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
