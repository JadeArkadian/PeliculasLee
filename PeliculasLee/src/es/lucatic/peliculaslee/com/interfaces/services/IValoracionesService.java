package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;

public interface IValoracionesService {

	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) throws ServiceException; 

	public List<Valoraciones> findValoracionesByIdPelicula(Peliculas pelicula)throws ServiceException; 

	public List<Valoraciones> findValoracionesByUsername(Usuarios usuario)throws ServiceException; 
	
	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion)throws ServiceException;

	public int countValoracionesByIdPelicula(Peliculas peliculas)throws ServiceException;

	public Double avgValoracionesByPelicula(Peliculas peliculas)throws ServiceException; 

	public void insert(Valoraciones valoracion)throws ServiceException; 


}
