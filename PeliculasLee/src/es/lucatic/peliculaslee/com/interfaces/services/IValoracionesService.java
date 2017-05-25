package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;

public interface IValoracionesService {

	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) throws ServiceException; 

	public List<Valoraciones> findValoracionesByIdPelicula(Valoraciones valoracion)throws ServiceException; 

	public List<Valoraciones> findValoracionesByUsername(Valoraciones valoracion)throws ServiceException; 
	
	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion)throws ServiceException;

	public int countValoracionesByIdPelicula(Valoraciones valoracion)throws ServiceException;

	public Double avgValoracionesByPelicula(Valoraciones valoracion)throws ServiceException; 

	public void insert(Valoraciones valoracion)throws ServiceException; 

//
//		public boolean add(Valoraciones valoracion);
//		
//		
//		public List<Valoraciones> list();
//		public List<Valoraciones> listbyAVG();
//		//Devuelve la media de las valoraciomnes de la pelicula que le metemeos como parametro
//		public double  searchAVG(Peliculas pelicula);
//		public List<Valoraciones> list(Usuarios usuario);
//		public List<Valoraciones> list(Peliculas pelicula);
//		
//		public Valoraciones search(Valoraciones valoracion);
//
//		
//		public boolean update(Valoraciones valoracion);	
}
