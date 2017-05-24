package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;

public interface ICategoriasPorPeliculaService {

	List<CategoriasPorPelicula> findByCategoria(Categorias categoria);

}
