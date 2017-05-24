package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;

public interface ICategoriasPorPeliculaService {

	
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdPelicula(Peliculas pelicula) ;
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdCategoria(Categorias categoria);
	
	public void insert(CategoriasPorPelicula categoriaPorPelicula) ;
	public void delete(CategoriasPorPelicula categoriaPorPelicula) ;

}
