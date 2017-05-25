package es.lucatic.peliculaslee.com.domains;

public class Peliculas {
	private int idPelicula;
	private String titulo;
	private String sinopsis;
	private int anio;
	private String director;
	private String reparto;
	private String username;
	private String imagen;

	/**
	 * Empty Constructor
	 */
	public Peliculas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * 
	 * @param idPelicula
	 * @param titulo
	 * @param imagen
	 * @param sinopsis
	 * @param anio
	 * @param director
	 * @param reparto
	 * @param username
	 * @param imagen
	 */
	public Peliculas(int idPelicula, String titulo, String sinopsis, int anio, String director,
			String reparto, String username, String imagen) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.imagen = imagen;
		this.sinopsis = sinopsis;
		this.anio = anio;
		this.director = director;
		this.reparto = reparto;
		this.username = username;
		this.imagen = imagen;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the sinopsis
	 */
	public String getSinopsis() {
		return sinopsis;
	}

	/**
	 * @param sinopsis
	 *            the sinopsis to set
	 */
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 *            the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the reparto
	 */
	public String getReparto() {
		return reparto;
	}

	/**
	 * @param reparto
	 *            the reparto to set
	 */
	public void setReparto(String reparto) {
		this.reparto = reparto;
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
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen
	 *            the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
