package es.lucatic.peliculaslee.com.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.CategoriasMapper;


public class CategoriasDAO implements ICategoriasDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Categorias> findAllCategorias() {
		String SQL = queriesDB.findAllCategoriasQuery;
		List<Categorias> categorias = null;
		try {
			categorias = jdbcTemplateObject.query(SQL, new CategoriasMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return categorias;
	}
	
	public Categorias findCategoriaByIdCategoria(Categorias categoria) {
		Categorias categoriaAux = null;
		try {
			String SQL = queriesDB.findCategoriaByIdCategoriaQuery;
			System.out.println("antes" + categoria.getIdCategoria());
			categoriaAux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { categoria.getIdCategoria() }, new CategoriasMapper());
			System.out.println("desp");
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return categoriaAux;
	}

	
	public void insert(Categorias categoria) {
		String SQL = queriesDB.insertCategoriaQuery;
		try {
			jdbcTemplateObject.update(SQL, categoria.getDescripcion());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	
	public void update(Categorias categoria) {
		String SQL = queriesDB.deleteCategoriaQuery;
		try {
			jdbcTemplateObject.update(SQL, categoria.getDescripcion(), categoria.getIdCategoria());
			System.out.println("Updated Categoria with ID = " + categoria.getIdCategoria());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	public void delete(Categorias categoria) {
		String SQL = queriesDB.deleteCategoriaQuery;
		try {
			jdbcTemplateObject.update(SQL, categoria.getIdCategoria());
			System.out.println("Deleted Categoria with ID = " + categoria.getIdCategoria());
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		return;
	}

	

}
