package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface ICategoriasDAO {
	public List<Categorias> findAllCategorias() throws DAOException;

	public Categorias findCategoriaByIdCategoria(Categorias categoria) throws DAOException;

	public void insert(Categorias categoria) throws DAOException;

	public void update(Categorias categoria) throws DAOException;

	public void delete(Categorias categoria) throws DAOException;
}
