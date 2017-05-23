package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;

public interface IValoracionesService {


	/**
	 * Interfaz para la clase CategoriaService. Define las funciones utilizadas 
	 * por dicha clase.
	 * 
	 *
	 */
	
		/**
		 * Añade un nuevo valoracion a la base de datos
		 * @param valoracion Un objeto de tipo Categoria con todas sus propiedades asignadas
		 * @return Esta funcion devuelve TRUE en caso de exito. FALSE en caso de fallo.
		 */
		public boolean add(Valoraciones valoracion);
		
		/**
		 * Devuelve una lista con todos los registros de la tabla de valoracions
		 * @return Devuelve una lista de valoracions. En caso de fallo, esta función devuelve NULL.
		 */
		public List<Valoraciones> list();
		public List<Valoraciones> listbyAVG();
		//Devuelve la media de las valoraciomnes de la pelicula que le metemeos como parametro
		public double  searchAVG(Peliculas pelicula);
		public List<Valoraciones> list(Usuarios usuario);
		public List<Valoraciones> list(Peliculas pelicula);
		/**
		 * Devuelve el valoracion de la base de datos a partir del valor del id_valoracion del objeto
		 * que pasamos como argumento de entrada
		 * @param valoracion El valoracion que queremos encontrar en la BD. Su id_valoracion debe estar
		 * correctamente asignado.
		 * @return Devuelve un objeto de tipo Categoria con todas sus propiedades asignadas. En caso de fallo
		 * esta función devolverá NULL.
		 */
		public Valoraciones search(Valoraciones valoracion);

		/**
		 * Modifica un valoracion existente de la base de datos. 
		 * @param valoracion El valoracion existente en la BD que queremos modificar. Sus propiedades deben estar
		 * debidamente inicializadas y su id_valoracion debe de existir en la tabla 
		 * @return Devuelve TRUE en caso de que la consulta se haya hecho con exito. FALSE en caso contrario.
		 */
		public boolean update(Valoraciones valoracion);	
}
