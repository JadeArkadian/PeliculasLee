package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IValoracionesDAO{
	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) throws DAOException; 

	public List<Valoraciones> findValoracionesByIdPelicula(Valoraciones valoracion)throws DAOException; 

	public List<Valoraciones> findValoracionesByUsername(Valoraciones valoracion)throws DAOException; 
	
	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion)throws DAOException;

	public int countValoracionesByIdPelicula(Valoraciones valoracion)throws DAOException;

	public Double avgValoracionesByPelicula(Valoraciones valoracion)throws DAOException; 

	public void insert(Valoraciones valoracion)throws DAOException; 
}
