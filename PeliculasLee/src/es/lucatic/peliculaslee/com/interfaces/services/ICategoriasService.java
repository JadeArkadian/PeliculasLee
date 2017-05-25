package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;

public interface ICategoriasService {
	

	public List<Categorias> findAllCategorias();
	
	public Categorias findCategoriaByIdCategoria(Categorias categoria);
	
	public void insert(Categorias categoria);

	
	public void update(Categorias categoria);
	public void delete(Categorias categoria);	

}
