package es.lucatic.peliculaslee.com.service;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.interfaces.services.IValoracionesService;

public class ValoracionesService implements IValoracionesService {

	public ValoracionesService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Valoraciones valoracion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Valoraciones> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Valoraciones> list(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Valoraciones> list(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //Busca una valoracion
	public Valoraciones search(Valoraciones valoracion) {
		// TODO Auto-generated method stub
		return null;
	}
	//Devuelve la media de las valoraciomnes de la pelicula que le metemeos como parametro
	public double searchAVG(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Valoraciones valoracion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Valoraciones> listbyAVG() {
		// TODO Auto-generated method stub
		return null;
	}

}
