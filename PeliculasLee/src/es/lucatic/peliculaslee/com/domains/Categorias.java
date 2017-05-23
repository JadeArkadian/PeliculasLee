package es.lucatic.peliculaslee.com.domains;

public class Categorias {
	private int idCategoria;
	private String descripcion;

	/**
	 * Empty Constructor
	 */
	public Categorias() {
		super();

	}

	/**
	 * Constructor
	 * 
	 * @param idCategoria
	 * @param descripcion
	 */
	public Categorias(int idCategoria, String descripcion) {
		super();
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
	}

	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria
	 *            the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
