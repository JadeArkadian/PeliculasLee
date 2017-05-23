package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;

public interface IPeliculasService {

	/**
	 * Interfaz para la clase PeliculaService. Define las funciones utilizadas 
	 * por dicha clase.
	 * 
	 *
	 */
	
		/**
		 * Añade un nuevo pelicula a la base de datos
		 * @param pelicula Un objeto de tipo Pelicula con todas sus propiedades asignadas
		 * @return Esta funcion devuelve TRUE en caso de exito. FALSE en caso de fallo.
		 */
		public boolean add(Peliculas pelicula);
		
		/**
		 * Devuelve una lista con todos los registros de la tabla de peliculas
		 * @return Devuelve una lista de peliculas. En caso de fallo, esta función devuelve NULL.
		 */
		public List<Peliculas> list();
		
		/**
		 * Devuelve el pelicula de la base de datos a partir del valor del id_pelicula del objeto
		 * que pasamos como argumento de entrada
		 * @param pelicula El pelicula que queremos encontrar en la BD. Su id_pelicula debe estar
		 * correctamente asignado.
		 * @return Devuelve un objeto de tipo Pelicula con todas sus propiedades asignadas. En caso de fallo
		 * esta función devolverá NULL.
		 */
		public List<Peliculas> list(Categorias categoria);
		
		public List<Peliculas> list(String letra);
		public List<Peliculas> listb(String letra);
		
		public Peliculas search(Peliculas pelicula);

		/**
		 * Modifica un pelicula existente de la base de datos. 
		 * @param pelicula El pelicula existente en la BD que queremos modificar. Sus propiedades deben estar
		 * debidamente inicializadas y su id_pelicula debe de existir en la tabla 
		 * @return Devuelve TRUE en caso de que la consulta se haya hecho con exito. FALSE en caso contrario.
		 */
		public boolean update (Peliculas pelicula);	

}


