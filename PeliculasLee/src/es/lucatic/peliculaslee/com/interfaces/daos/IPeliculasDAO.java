package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IPeliculasDAO {
	public List<Peliculas> findAllPeliculas() throws DAOException;

	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula) throws DAOException;

	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula) throws DAOException;

	public List<Peliculas> findPeliculasByTituloLike(String cadena) throws DAOException;

	public List<Peliculas> findPeliculasByAnio(int anio) throws DAOException;

	public List<Peliculas> findPeliculasByDirector(int anio) throws DAOException;

	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula) throws DAOException;

	public List<Peliculas> findLast12Peliculas() throws DAOException;

	public Peliculas findPeliculasWithAnioHigherThan(int anio) throws DAOException;

	public Peliculas findPeliculasWithAnioLowerThan(int anio) throws DAOException;

	public void insertPelicula(Peliculas pelicula) throws DAOException;

	public void deletePelicula(Peliculas pelicula) throws DAOException;

	public void updatePelicula(Peliculas pelicula) throws DAOException;

}
