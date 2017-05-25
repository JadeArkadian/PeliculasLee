package es.lucatic.peliculaslee.com.service;

import java.util.ArrayList;
import java.util.List;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasPorPeliculaDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.services.ICategoriasService;
import es.lucatic.peliculaslee.com.interfaces.services.IUsuariosService;

public class CategoriasService implements ICategoriasService {

	public CategoriasService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Categorias> findAllCategorias() throws ServiceException{
		TransactionManager daoManager = null;
		List<Categorias>  categorias= new ArrayList<Categorias>();
		
		try {
			
				daoManager = new TransactionManager();
				ICategoriasDAO categoriasDAO = daoManager.getCategoriasDAO ();
				categorias = categoriasDAO.findAllCategorias();
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findallategorias"+e.getMessage());

		}
		
		return categorias;
	}
	

	@Override
	public Categorias findCategoriaByIdCategoria(Categorias categoria)throws ServiceException{
		TransactionManager daoManager = null;
		Categorias  categoria_aux= new Categorias();
		
		try {
			
				daoManager = new TransactionManager();
				ICategoriasDAO categoriasDAO = daoManager.getCategoriasDAO ();
				categoria_aux = categoriasDAO. findCategoriaByIdCategoria(categoria);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findCategoriaByIdCategoria "+e.getMessage());

		}
		
		return categoria;
	}

	@Override
	public void insert(Categorias categoria) throws ServiceException {
		TransactionManager daoManager = null;
	
		
		try {
			
				daoManager = new TransactionManager();
				ICategoriasDAO categoriasDAO = daoManager.getCategoriasDAO ();
				categoriasDAO.insert(categoria);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en insertcategoria "+e.getMessage());

		}
		
		
		
	}

	@Override
	public void update(Categorias categoria) throws ServiceException{
		TransactionManager daoManager = null;
		Categorias  categoria_aux= new Categorias();
		
		try {
			if(categoria!=null){
				daoManager = new TransactionManager();
				ICategoriasDAO categoriasDAO = daoManager.getCategoriasDAO ();
				categoriasDAO.update(categoria);
				}
			
			else{
			
				throw new ServiceException( "La categoria que se quiere bmodificar es NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException("Problema en update categoria  "+e.getMessage());
			}
		
		
	}

	@Override
	public void delete(Categorias categoria) throws ServiceException{
		TransactionManager daoManager = null;
		Categorias  categoria_aux= new Categorias();
		
		try {
			if(categoria!=null){
				daoManager = new TransactionManager();
				ICategoriasDAO categoriasDAO = daoManager.getCategoriasDAO ();
				categoriasDAO.delete(categoria);
				}
			
			else{
			
				throw new ServiceException( "La categoria que se quiere borrar es NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException("Problema en delete categoria  "+e.getMessage());
			}
		
		
	}

	



}
