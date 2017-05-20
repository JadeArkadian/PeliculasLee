package es.lucatic.peliculaslee.com.domains;

/**
 * Clase domain que almacena los datos e informacion que describen a un usuario
 * de este sitio web
 * @author Jade Arkadian
 *
 */
public class Usuario 
{
	/**************************************************/
	/***************** PROPIEDADES ********************/
	/**************************************************/
	
	/**
	 * El id_usuario. Se trata del nombre de la cuenta, el cual
	 * es unico de cada usuario. 
	 */
	private String id_usuario;
	
	/**
	 * La direccion de email del usuario. Debe de ser una 
	 * dirección de email valida.
	 */
	private String email;
	
	/**
	 * El password del usuario. 
	 */
	private String pass;

	/**************************************************/
	/****************** GET y SET ********************/
	/**************************************************/

	/**
	 * @return El id_usuario
	 */
	public String getId_usuario() 
	{
		return id_usuario;
	}

	/***********************/

	/**
	 * @param id_usuario El nuevo valor de id_usuario 
	 */
	public void setId_usuario(String id_usuario) 
	{
		this.id_usuario = id_usuario;
	}

	/***********************/

	/**
	 * @return El email
	 */
	public String getEmail() 
	{
		return email;
	}

	/***********************/

	/**
	 * @param email El nuevo valor de email
	 */
	public void setEmail(String email) 
	{
		this.email = email;
	}

	/***********************/

	/**
	 * @return El pass
	 */
	public String getPass() 
	{
		return pass;
	}

	/***********************/

	/**
	 * @param El nuevo valor de pass 
	 */
	public void setPass(String pass) 
	{
		this.pass = pass;
	}

	
	/**************************************************/
	/***************** CONSTRUCTORES ******************/
	/**************************************************/
	
	/**
	 * Constructor vacia por defecto
	 */
	public Usuario() 
	{
		super();
	}
	
	/***********************/

	/**
	 * Constructor con parametros de la clase. Inicializa todas
	 * las propiedades del objeto creado.
	 * @param id_usuario El id_usuario
	 * @param email El email
	 * @param pass El pass
	 */
	public Usuario(String id_usuario, String email, String pass) 
	{
		super();
		this.id_usuario = id_usuario;
		this.email = email;
		this.pass = pass;
	}
	
	
	
	
}
