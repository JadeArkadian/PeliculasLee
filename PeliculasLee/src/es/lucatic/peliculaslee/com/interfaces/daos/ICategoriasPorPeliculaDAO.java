package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface ICategoriasPorPeliculaDAO {
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdPelicula(Peliculas pelicula) throws DAOException;

	public void insert(CategoriasPorPelicula categoriaPorPelicula) throws DAOException;

	public void delete(CategoriasPorPelicula categoriaPorPelicula) throws DAOException;
}