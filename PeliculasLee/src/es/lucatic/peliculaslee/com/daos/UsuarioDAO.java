package es.lucatic.peliculaslee.com.daos;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.interfaces.daos.IUsuariosDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.UsuariosMapper;

public class UsuarioDAO implements IUsuariosDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Usuarios findUsuariosByUsername(Usuarios usuarios) {
		Usuarios studentaux = null;
		try {
			String SQL = queriesDB.findUsuariosByUsernameQuery;
			System.out.println("Mostrando usuarios con username" + usuarios.getUsername());
			studentaux = jdbcTemplateObject.queryForObject(SQL, new Object[] { usuarios.getUsername() },
					new UsuariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return studentaux;
	}

	public void insertUsuario(Usuarios usuarios) {
		String SQL = queriesDB.insertUsuarioQuery;
		try {
			jdbcTemplateObject.update(SQL, usuarios.getUsername(), usuarios.getPassword(), usuarios.getNombre(),
					usuarios.getApellidos(), usuarios.getEmail(), usuarios.getImagen());
			System.out.println("Created usuario = " + usuarios.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void updateUsuario(Usuarios usuarios) {
		String SQL = queriesDB.updateUsuarioQuery;
		try {
			jdbcTemplateObject.update(SQL, usuarios.getPassword(), usuarios.getNombre(), usuarios.getApellidos(),
					usuarios.getEmail(), usuarios.getImagen(), usuarios.getUsername());
			System.out.println("Updated Record with Username = " + usuarios.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void deleteUsuario(Usuarios usuarios) {
		String SQL = queriesDB.deleteUsuarioQuery;
		try {
			jdbcTemplateObject.update(SQL, usuarios.getUsername());
			System.out.println("Deleted Record with Username = " + usuarios.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
