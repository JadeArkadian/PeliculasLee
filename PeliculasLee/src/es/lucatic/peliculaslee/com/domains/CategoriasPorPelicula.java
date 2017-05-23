package es.lucatic.peliculaslee.com.domains;

public class CategoriasPorPelicula {
	private int idPelicula;
	private int idCategoria;

	/**
	 * Empty Constructor
	 */
	public CategoriasPorPelicula() {
		super();
	}

	/**
	 *Constructor
	 * @param idPelicula
	 * @param idCategoria
	 */
	public CategoriasPorPelicula(int idPelicula, int idCategoria) {
		super();
		this.idPelicula = idPelicula;
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the idPelicula
	 */
	public int getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula the idPelicula to set
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	
}
