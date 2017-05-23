package es.lucatic.peliculaslee.com.domains;

public class Valoraciones {
	private int idPelicula;
	private String username;
	private int valoracion;

	/**
	 * Empty Constructor
	 */
	public Valoraciones() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param idPelicula
	 * @param username
	 * @param valoracion
	 */
	public Valoraciones(int idPelicula, String username, int valoracion) {
		super();
		this.idPelicula = idPelicula;
		this.username = username;
		this.valoracion = valoracion;
	}

	/**
	 * @return the idPelicula
	 */
	public int getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula
	 *            the idPelicula to set
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
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

	/**
	 * @return the valoracion
	 */
	public int getValoracion() {
		return valoracion;
	}

	/**
	 * @param valoracion
	 *            the valoracion to set
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

}
