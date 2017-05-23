package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;

public interface ICategoriasService {
	



	/**
	 * Interfaz para la clase CategoriaService. Define las funciones utilizadas 
	 * por dicha clase.
	 * 
	 *
	 */
	
		/**
		 * Añade un nuevo categoria a la base de datos
		 * @param categoria Un objeto de tipo Categoria con todas sus propiedades asignadas
		 * @return Esta funcion devuelve TRUE en caso de exito. FALSE en caso de fallo.
		 */
		public boolean add(Categorias categoria);
		
		/**
		 * Devuelve una lista con todos los registros de la tabla de categorias
		 * @return Devuelve una lista de categorias. En caso de fallo, esta función devuelve NULL.
		 */
		public List<Categorias> list();
		
		/**
		 * Devuelve el categoria de la base de datos a partir del valor del id_categoria del objeto
		 * que pasamos como argumento de entrada
		 * @param categoria El categoria que queremos encontrar en la BD. Su id_categoria debe estar
		 * correctamente asignado.
		 * @return Devuelve un objeto de tipo Categoria con todas sus propiedades asignadas. En caso de fallo
		 * esta función devolverá NULL.
		 */
		public Categorias search(Categorias categoria);

		/**
		 * Modifica un categoria existente de la base de datos. 
		 * @param categoria El categoria existente en la BD que queremos modificar. Sus propiedades deben estar
		 * debidamente inicializadas y su id_categoria debe de existir en la tabla 
		 * @return Devuelve TRUE en caso de que la consulta se haya hecho con exito. FALSE en caso contrario.
		 */
		public boolean update(Categorias categoria);	

}
