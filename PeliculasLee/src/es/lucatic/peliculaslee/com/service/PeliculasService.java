package es.lucatic.peliculaslee.com.service;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;

public class PeliculasService implements IPeliculasService {

	public PeliculasService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Peliculas pelicula) {

		void insertPelicula(Peliculas pelicula
		return false;
	}

	@Override
	public List<Peliculas> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Peliculas> list(Categorias categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Peliculas> list(String letra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Peliculas search(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Peliculas> listb(String letra) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Peliculas> findPeliculasWithAnioHigherThanQuery(int anio){
		return null;
	}
	
	public List<Peliculas> findPeliculasWithAnioLowerThanQuery(int anio){
		return null;
	}

}
