package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.interfaces.daos.IComentariosDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.ComentariosMapper;

public class ComentariosDAO implements IComentariosDAO {
	private DataSource dataSource;
	private static JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Comentarios> findAllComentarios() {
		String SQL = queriesDB.findAllComentariosQuery;
		List<Comentarios> comentarios = null;
		try {
			comentarios = jdbcTemplateObject.query(SQL, new ComentariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return comentarios;
	}

	public Comentarios findComentarioByIdPeliculaAndUsername(Comentarios comentario) {
		Comentarios comentarioAux = null;
		try {
			String SQL = queriesDB.findComentarioByIdPeliculaAndUsernameQuery;
			comentarioAux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { comentario.getIdPelicula(), comentario.getUsername() }, new ComentariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return comentarioAux;
	}

	public List<Comentarios> findComentariosByIdPelicula(Peliculas pelicula) {
		String SQL = queriesDB.findComentariosByIdPeliculaQuery;
		List<Comentarios> comentarios = null;
		try {
			comentarios = jdbcTemplateObject.query(SQL, new Object[] { pelicula.getIdPelicula() },
					new ComentariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return comentarios;
	}
	
	public List<Comentarios> findComentariosByUsername(Usuarios usuario) {
		String SQL = queriesDB.findComentariosByUsernameQuery;
		List<Comentarios> comentarios = null;
		try {
			comentarios = jdbcTemplateObject.query(SQL, new Object[] { usuario.getUsername() },
					new ComentariosMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return comentarios;
	}

	public int countComentariosByIdPelicula(Peliculas pelicula) {
		int numComentarios=0;
		try {
			String SQL = queriesDB.findComentarioByIdPeliculaAndUsernameQuery;
			numComentarios = jdbcTemplateObject.queryForObject(SQL,
					new Object[] {pelicula.getIdPelicula()}, Integer.class);
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return numComentarios;
	}
	
	public void insertComentario(Comentarios comentario) {
		String SQL = queriesDB.insertComentarioQuery;
		try {
			jdbcTemplateObject.update(SQL, comentario.getIdPelicula(),comentario.getUsername(), comentario.getComentario());
			
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void deleteComentario(Comentarios comentario) {
		String SQL = queriesDB.deleteComentarioQuery;
		try {
			jdbcTemplateObject.update(SQL, comentario.getIdPelicula(),comentario.getUsername());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
