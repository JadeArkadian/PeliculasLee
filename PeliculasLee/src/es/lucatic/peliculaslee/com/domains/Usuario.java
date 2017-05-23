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
	
	private String username;
	private String nombre;
	private String apellidos;
	private String email;
	private String imagen;
	private String password;
	

	/**************************************************/
	/****************** GET y SET ********************/
	/**************************************************/
	

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
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

	public Usuario(String username, String nombre, String apellidos, String email, String password,String imagen) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.imagen = imagen;
		this.password = password;
	}
	

	
	
	
	
}
