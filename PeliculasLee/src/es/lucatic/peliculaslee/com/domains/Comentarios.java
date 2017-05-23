package es.lucatic.peliculaslee.com.domains;

public class Comentarios {
	private int idPelicula;
	private String username;
	private String comentario;

	/**
	 * Empty Constructor
	 */
	public Comentarios() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param idPelicula
	 * @param username
	 * @param comentario
	 */
	public Comentarios(int idPelicula, String username, String comentario) {
		super();
		this.idPelicula = idPelicula;
		this.username = username;
		this.comentario = comentario;
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
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param valoracion
	 *            the valoracion to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}