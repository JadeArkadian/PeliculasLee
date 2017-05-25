package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;


import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;


public interface IPeliculasDAO{
	public List<Peliculas> findAllPeliculas() ;
	
	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula) throws DAOException;
	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula) throws DAOException;
	
	public List<Peliculas> findPeliculasByTituloLike(String cadena) throws DAOException;
	public List<Peliculas> findPeliculasByAnio(int anio) ;
	public List<Peliculas> findPeliculasByDirector(String director) throws DAOException;
	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula) throws DAOException ;
	
	public List<Peliculas> findLast12Peliculas() throws DAOException;
	
	public List<Peliculas> findPeliculasWithAnioHigherThan(int anio) throws DAOException;
	
	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio)throws DAOException;
	public void insertPelicula(Peliculas pelicula)throws DAOException;

	

	public void deletePelicula(Peliculas pelicula)throws DAOException;

	public void updatePelicula(Peliculas pelicula) throws DAOException;
	public List<Peliculas> findPeliculaByLetra(String letraEscogida)throws DAOException;

}
