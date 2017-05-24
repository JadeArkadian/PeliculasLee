package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.CategoriasMapper;

public interface ICategoriasDAO{

	public void setDataSource(DataSource dataSource);

	public List<Categorias> findAllCategorias();
	
	public Categorias findCategoriaByIdCategoria(Categorias categoria);
	
	public void insert(Categorias categoria);

	
	public void update(Categorias categoria);
	public void delete(Categorias categoria);
}
