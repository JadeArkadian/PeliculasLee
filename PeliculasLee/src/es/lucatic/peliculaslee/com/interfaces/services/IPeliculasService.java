package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.ArrayList;
import java.util.List;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;

public interface IPeliculasService {

	public void insertPelicula(Peliculas pelicula)throws ServiceException;

	public List<Peliculas> findAllPeliculas()throws ServiceException;

	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula)throws ServiceException;

	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula)throws ServiceException;

	public List<Peliculas> findPeliculasByTituloLike(String cadena)throws ServiceException;

	public List<Peliculas> findPeliculasByAnio(int anio);

	public List<Peliculas> findPeliculasByDirector(String director)throws ServiceException;

	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula)throws ServiceException;
	public List<Peliculas> findPeliculaByLetra(String letraEscogida)throws ServiceException;

	public List<Peliculas> findLast12Peliculas()throws ServiceException;

	public List<Peliculas> findPeliculasWithAnioHigherThan(int anio)throws ServiceException;

	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio)throws ServiceException;

	public void deletePelicula(Peliculas pelicula)throws ServiceException;

	public void updatePelicula(Peliculas pelicula)throws ServiceException;
	

}


