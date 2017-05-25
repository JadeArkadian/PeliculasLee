package es.lucatic.peliculaslee.com.daos;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.interfaces.daos.IUsuariosDAO;
import es.lucatic.peliculaslee.com.utils.QueriesDb;
import es.lucatic.peliculaslee.com.utils.rowmappers.UsuariosMapper;

public class UsuariosDAO implements IUsuariosDAO {
	private DataSource dataSource;
	private static JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Usuarios findUsuariosByUsername(Usuarios usuario) {
		Usuarios studentaux = null;
		try {
			String SQL = QueriesDb.findUsuariosByUsernameQuery;
			System.out.println("DAO username: "+usuario.getUsername());
			studentaux = jdbcTemplateObject.queryForObject(SQL, new Object[] { usuario.getUsername() },new UsuariosMapper());
			System.out.println("fin");
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra nada select
			System.out.println("excepcion" + ex);
		}/* catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}*/
		return studentaux;
	}

	public void insertUsuario(Usuarios usuario) {
		String SQL = QueriesDb.insertUsuarioQuery;
		try {
				jdbcTemplateObject.update(SQL, usuario.getUsername(), usuario.getPassword(), usuario.getNombre(),
					usuario.getApellidos(), usuario.getEmail(), usuario.getImagen());
			System.out.println("Created usuario = " + usuario.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void updateUsuario(Usuarios usuario) {
		String SQL = QueriesDb.updateUsuarioQuery;
		try {
			jdbcTemplateObject.update(SQL, usuario.getPassword(), usuario.getNombre(), usuario.getApellidos(),
					usuario.getEmail(), usuario.getImagen(), usuario.getUsername());
			System.out.println("Updated Record with Username = " + usuario.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void deleteUsuario(Usuarios usuario) {
		String SQL = QueriesDb.deleteUsuarioQuery;
		try {
			jdbcTemplateObject.update(SQL, usuario.getUsername());
			System.out.println("Deleted Record with Username = " + usuario.getUsername());
		} catch (DAOException e) {
			e.getMessage();
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
