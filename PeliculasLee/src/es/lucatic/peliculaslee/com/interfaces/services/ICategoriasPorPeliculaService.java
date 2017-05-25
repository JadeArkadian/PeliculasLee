package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;

public interface ICategoriasPorPeliculaService {

	
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdPelicula(Peliculas pelicula) throws ServiceException;
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdCategoria(Categorias categoria) throws ServiceException;
	
	public void insert(CategoriasPorPelicula categoriaPorPelicula) throws ServiceException;
	public void delete(CategoriasPorPelicula categoriaPorPelicula) throws ServiceException;

}
