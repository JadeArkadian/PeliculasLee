package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;


import es.lucatic.peliculaslee.com.domains.Peliculas;


public interface IPeliculasDAO{
	public List<Peliculas> findAllPeliculas() ;
	
	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula) ;
	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula);
	
	public List<Peliculas> findPeliculasByTituloLike(String cadena);
	public List<Peliculas> findPeliculasByAnio(int anio) ;
	public List<Peliculas> findPeliculasByDirector(String director) ;
	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula) ;
	
	public List<Peliculas> findLast12Peliculas();
	
	public List<Peliculas> findPeliculasWithAnioHigherThan(int anio);
	
	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio);
	public void insertPelicula(Peliculas pelicula);

	

	public void deletePelicula(Peliculas pelicula);

	public void updatePelicula(Peliculas pelicula);
	public List<Peliculas> findPeliculaByLetra(String letraEscogida);

}
