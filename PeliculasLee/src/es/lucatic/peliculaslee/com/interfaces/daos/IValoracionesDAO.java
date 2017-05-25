package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IValoracionesDAO{
	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) throws DAOException; 

	public List<Valoraciones> findValoracionesByIdPelicula(Peliculas peliculas)throws DAOException; 

	public List<Valoraciones> findValoracionesByUsername(Usuarios usuario)throws DAOException; 
	
	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion)throws DAOException;

	public int countValoracionesByIdPelicula(Peliculas pelicula)throws DAOException;

	public Double avgValoracionesByPelicula(Peliculas pelicula)throws DAOException; 

	public void insert(Valoraciones valoracion)throws DAOException; 
}
