package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.interfaces.daos.IValoracionesDAO;
import es.lucatic.peliculaslee.com.utils.QueriesDb;
import es.lucatic.peliculaslee.com.utils.rowmappers.ValoracionesMapper;

public class ValoracionesDAO implements IValoracionesDAO {
	private DataSource dataSource;
	private static JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) {
		Valoraciones valoracionAux = null;
		try {
			String SQL = QueriesDb.findValoracionesByIdPeliculaAndUsernameQuery;
			valoracionAux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { valoracion.getIdPelicula(), valoracion.getUsername() }, new ValoracionesMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return valoracionAux;
	}

	@Override
	public List<Valoraciones> findValoracionesByIdPelicula(Peliculas pelicula) {
		List<Valoraciones> valoraciones = null;
		try {
			String SQL = QueriesDb.findValoracionesByIdPeliculaQuery;
			valoraciones = jdbcTemplateObject.query(SQL, new Object[] { pelicula.getIdPelicula() },
					new ValoracionesMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return valoraciones;
	}
	@Override
	public List<Valoraciones> findValoracionesByUsername(Usuarios usuario) {
		List<Valoraciones> valoraciones = null;
		try {
			String SQL = QueriesDb.findValoracionesByUsernameQuery;
			valoraciones = jdbcTemplateObject.query(SQL, new Object[] { usuario.getUsername() },
					new ValoracionesMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return valoraciones;
	}

	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion) {
		String SQL = QueriesDb.countValoracionesByValoracionAndPeliculaQuery;
		int numValoraciones = 0;
		try {
			numValoraciones = jdbcTemplateObject.queryForObject(SQL, new Object[] { valoracion.getIdPelicula() },
					Integer.class);
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return numValoraciones;
	}

	public int countValoracionesByIdPelicula(Peliculas pelicula) {
		String SQL = QueriesDb.countValoracionesByIdPeliculaQuery;
		int numValoraciones = 0;
		try {
			numValoraciones = jdbcTemplateObject.queryForObject(SQL, new Object[] { pelicula.getIdPelicula() },
					Integer.class);
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return numValoraciones;
	}

	public Double avgValoracionesByPelicula(Peliculas pelicula) {
		String SQL = QueriesDb.avgValoracionesByPeliculaQuery;
		double mediaValoraciones=0.0;
		try {
			mediaValoraciones = jdbcTemplateObject.queryForObject(SQL, new Object[] { pelicula.getIdPelicula() },
					Double.class);
		} catch (IncorrectResultSizeDataAccessException ex) { // no encuentra
																// nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return mediaValoraciones;
	}

	public void insert(Valoraciones valoracion) {
		String SQL = QueriesDb.insertValoracionQuery;
		try {
			jdbcTemplateObject.update(SQL, valoracion.getIdPelicula(),valoracion.getUsername());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	/*public void delete(Valoraciones valoracion) {
		String SQL = queriesDB.deleteValoracionQuery;
		try {
			jdbcTemplateObject.update(SQL, valoracion.getIdPelicula());
			System.out.println("Deleted Pelicula with ID = " + valoracion.getIdCategoria());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}
*/
}
