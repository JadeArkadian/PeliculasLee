package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;

public interface ICategoriasService {
	

	public List<Categorias> findAllCategorias() throws ServiceException;
	
	public Categorias findCategoriaByIdCategoria(Categorias categoria) throws ServiceException;
	
	public void insert(Categorias categoria) throws ServiceException;

	
	public void update(Categorias categoria)throws ServiceException;
	public void delete(Categorias categoria) throws ServiceException;	

}
