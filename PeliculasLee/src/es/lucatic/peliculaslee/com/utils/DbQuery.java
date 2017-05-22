package es.lucatic.peliculaslee.com.utils;

/**
 * Clase cuyo proposito es almacenar una serie de constantes con las cadenas de
 * las querys utilizadas por los metodos de las clase DAO.
 * @author Jade Arkadian
 *
 */
public class DbQuery 
{
	
	/**************************************************/
	/******************** USUARIO *********************/
	/**************************************************/
	
	public final static String addUsuarioQuery = "";
	
	public final static String listUsuarioQuery = "SELECT * FROM usuario";
	
	public final static String searchUsuarioQuery = "SELECT * FROM usuario WHERE id_usuario = ?";

	public final static String updateUsuarioQuery = "";
}
