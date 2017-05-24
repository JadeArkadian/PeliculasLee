package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.PeliculasMapper;



public class PeliculasDAO implements IPeliculasDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Peliculas> findAllPeliculas() {
		String SQL = queriesDB.findAllPeliculasQuery;
		List<Peliculas> peliculas = null;
		try {
			peliculas = jdbcTemplateObject.query(SQL, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculas;
	}
	
	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula) {
		Peliculas peliculaAux = null;
		try {
			String SQL = queriesDB.findPeliculaByIdPeliculaQuery;
			peliculaAux = jdbcTemplateObject.queryForObject(SQL, new Object[] { pelicula.getIdPelicula() }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return peliculaAux;
	}
	
	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula) {
		List<Peliculas> peliculas = null;
		try {
			String SQL = queriesDB.findPeliculasByTituloQuery;
			peliculas = jdbcTemplateObject.query(SQL, new Object[] { pelicula.getTitulo() }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return peliculas;
	}
	
	public List<Peliculas> findPeliculasByTituloLike(String cadena) {
		List<Peliculas> peliculas = null;
		cadena="%"+cadena+"%";
		try {
			String SQL = queriesDB.findPeliculasByTituloLikeQuery;
			peliculas = jdbcTemplateObject.query(SQL, new Object[] { cadena }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return peliculas;
	}
	
	public List<Peliculas> findPeliculasByAnio(int anio) {
		List<Peliculas> peliculas = null;
		try {
			String SQL = queriesDB.findPeliculasByAnioQuery;
			peliculas = jdbcTemplateObject.query(SQL, new Object[] { anio }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return peliculas;
	}

	public List<Peliculas> findPeliculasByDirector(String director) {
		List<Peliculas> peliculas = null;
		try {
			String SQL = queriesDB.findPeliculasByDirectorQuery;
			peliculas = jdbcTemplateObject.query(SQL, new Object[] { director }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculas;
	}
	
	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula) {
		List<Peliculas> peliculas = null;
		try {
			String SQL = queriesDB.findPeliculasByUsernameQuery;
			peliculas = jdbcTemplateObject.query(SQL, new Object[] { pelicula.getUsername() }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculas;
	}
	
	
	public List<Peliculas> findLast12Peliculas() {
		List<Peliculas> peliculas = null;
		try {
			String SQL = queriesDB.findLast12PeliculasQuery;
			peliculas = jdbcTemplateObject.query(SQL, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculas;
	}
	
	public List<Peliculas>  findPeliculasWithAnioHigherThan(int anio) {
		List<Peliculas> peliculaAux = null;
		try {
			String SQL = queriesDB.findPeliculasWithAnioHigherThanQuery;
			peliculaAux = jdbcTemplateObject.query(SQL, new Object[] { anio }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculaAux;
	}
	
	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio) {
		List<Peliculas> peliculaAux = null;
		try {
			String SQL =queriesDB.findPeliculasWithAnioLowerThanQuery;
			peliculaAux = jdbcTemplateObject.query(SQL, new Object[] { anio }, new PeliculasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return peliculaAux;
	}
	
	public void insertPelicula(Peliculas pelicula) {
		String SQL = queriesDB.insertPeliculaQuery;
		try {
			jdbcTemplateObject.update(SQL, pelicula.getTitulo(), pelicula.getSinopsis(), pelicula.getAnio(), pelicula.getDirector(), pelicula.getReparto(), pelicula.getUsername());
			System.out.println("Created Pelicula Title = " + pelicula.getTitulo());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	

	public void deletePelicula(Peliculas pelicula) {
		String SQL = queriesDB.deletePeliculasQuery;
		try {
			jdbcTemplateObject.update(SQL, pelicula.getIdPelicula());
			System.out.println("Deleted Record with ID = " + pelicula.getIdPelicula());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void updatePelicula(Peliculas pelicula) {
		String SQL = queriesDB.updatePeliculasQuery;
		try {
			jdbcTemplateObject.update(SQL, pelicula.getTitulo(), pelicula.getSinopsis(), pelicula.getAnio(), pelicula.getDirector(), pelicula.getReparto(), pelicula.getUsername(), pelicula.getIdPelicula());
			System.out.println("Updated Record with IDPelicula = " + pelicula.getIdPelicula());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

}
