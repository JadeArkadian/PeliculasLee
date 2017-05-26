package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasPorPeliculaDAO;
import es.lucatic.peliculaslee.com.utils.QueriesDb;
import es.lucatic.peliculaslee.com.utils.rowmappers.CategoriasPorPeliculaMapper;


public class CategoriasPorPeliculaDAO implements ICategoriasPorPeliculaDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdPelicula(Peliculas pelicula) 
	{
		String SQL = QueriesDb.findCategoriasPorPeliculaByIdPeliculaQuery;
		List<CategoriasPorPelicula> categoriasEnLaPelicula = null;
		
		try 
		{
			categoriasEnLaPelicula = jdbcTemplateObject.query(SQL, new Object[] {pelicula.getIdPelicula()}, new CategoriasPorPeliculaMapper());
		} 
		catch (IncorrectResultSizeDataAccessException ex) 
		{ //no encuentra nada select
			System.out.println("excepcion" + ex);
		} 
		catch (Exception ex) 
		{
			System.out.println("excepcion" + ex);
		}
		return categoriasEnLaPelicula;
	}
	
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdCategoria(Categorias categoria) {
		String SQL = QueriesDb.findCategoriasPorPeliculaByIdCategoriaQuery;
		List<CategoriasPorPelicula> categoriasEnLaPelicula = null;
		try {
			categoriasEnLaPelicula = jdbcTemplateObject.query(SQL, new Object[] {categoria.getIdCategoria()}, new CategoriasPorPeliculaMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return categoriasEnLaPelicula;
	}
	
	public void insert(CategoriasPorPelicula categoriaPorPelicula) {
		String SQL = QueriesDb.insertCategoriaQuery;
		try {
			jdbcTemplateObject.update(SQL, categoriaPorPelicula.getIdPelicula(), categoriaPorPelicula.getIdCategoria());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void delete(CategoriasPorPelicula categoriaPorPelicula) {
		String SQL = QueriesDb.deleteCategoriaQuery;
		try {
			jdbcTemplateObject.update(SQL, categoriaPorPelicula.getIdCategoria());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	

}
