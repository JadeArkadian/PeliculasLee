
package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Usuario;

/**
 * Interfaz para la clase UsuarioService. Define las funciones utilizadas 
 * por dicha clase.
 * @author Jade Arkadian
 *
 */
public interface IUsuarioService 
{
	/**
	 * Añade un nuevo usuario a la base de datos
	 * @param usuario Un objeto de tipo Usuario con todas sus propiedades asignadas
	 * @return Esta funcion devuelve TRUE en caso de exito. FALSE en caso de fallo.
	 */
	public boolean addUsuario(Usuario usuario);
	
	/**
	 * Devuelve una lista con todos los registros de la tabla de usuarios
	 * @return Devuelve una lista de usuarios. En caso de fallo, esta función devuelve NULL.
	 */
	public List<Usuario> listUsuario();
	
	/**
	 * Devuelve el usuario de la base de datos a partir del valor del id_usuario del objeto
	 * que pasamos como argumento de entrada
	 * @param usuario El usuario que queremos encontrar en la BD. Su id_usuario debe estar
	 * correctamente asignado.
	 * @return Devuelve un objeto de tipo Usuario con todas sus propiedades asignadas. En caso de fallo
	 * esta función devolverá NULL.
	 */
	public Usuario searchUsuario(Usuario usuario);

	/**
	 * Modifica un usuario existente de la base de datos. 
	 * @param usuario El usuario existente en la BD que queremos modificar. Sus propiedades deben estar
	 * debidamente inicializadas y su id_usuario debe de existir en la tabla 
	 * @return Devuelve TRUE en caso de que la consulta se haya hecho con exito. FALSE en caso contrario.
	 */
	public boolean updateUsuario(Usuario usuario);	

}
