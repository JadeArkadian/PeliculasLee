/**
 * 
 */
package es.lucatic.peliculaslee.com.domains;

/**
 * @author admin
 *
 */
public class Administradores {

	private String username;

	/**
	 * Empty Constructor
	 */
	public Administradores() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * 
	 * @param username
	 */
	public Administradores(String username) {
		super();
		this.username = username;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
