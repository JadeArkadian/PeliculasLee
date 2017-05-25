package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.domains.Comentarios;

public interface IComentariosService {

	public boolean add(Comentarios comentario) ;
	
	/**
	 * Devuelve una lista con todos los registros de la tabla de comentarios
	 * @return Devuelve una lista de comentarios. En caso de fallo, esta función devuelve NULL.
	 */
	public List<Comentarios> list();


	public List<Comentarios> list(Usuarios usuario);
	public List<Comentarios> list(Peliculas pelicula);
	/**
	 * Devuelve el comentario de la base de datos a partir del valor del id_comentario del objeto
	 * que pasamos como argumento de entrada
	 * @param comentario El comentario que queremos encontrar en la BD. Su id_comentario debe estar
	 * correctamente asignado.
	 * @return Devuelve un objeto de tipo Categoria con todas sus propiedades asignadas. En caso de fallo
	 * esta función devolverá NULL.
	 */
	public Comentarios search(Comentarios comentario);

	/**
	 * Modifica un comentario existente de la base de datos. 
	 * @param comentario El comentario existente en la BD que queremos modificar. Sus propiedades deben estar
	 * debidamente inicializadas y su id_comentario debe de existir en la tabla 
	 * @return Devuelve TRUE en caso de que la consulta se haya hecho con exito. FALSE en caso contrario.
	 */
	public boolean update(Comentarios comentario);	
}


