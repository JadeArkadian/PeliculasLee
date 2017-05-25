package es.lucatic.peliculaslee.com.service;

import java.util.ArrayList;
import java.util.List;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasPorPeliculaDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.services.ICategoriasPorPeliculaService;

public class CategoriasPorPeliculaService implements ICategoriasPorPeliculaService {

	public CategoriasPorPeliculaService() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdPelicula(Peliculas pelicula) throws ServiceException{
		TransactionManager daoManager = null;
		List<CategoriasPorPelicula>  categoriasPorPelicula= new ArrayList<CategoriasPorPelicula>();
		
		try {
			
				daoManager = new TransactionManager();
				ICategoriasPorPeliculaDAO categoriasPorPeliculaDAO = daoManager.getCategoriasPorPeliculaDAO ();
				categoriasPorPelicula = categoriasPorPeliculaDAO.findCategoriasPorPeliculaByIdPelicula(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findCategoriasPorPeliculaByIdPelicula "+e.getMessage());

		}
		
		return categoriasPorPelicula;
	}

	@Override
	public void insert(CategoriasPorPelicula categoriaPorPelicula) throws ServiceException {
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			ICategoriasPorPeliculaDAO categoriaPorPeliculaDAO=daoManager.getCategoriasPorPeliculaDAO();
			if(categoriaPorPelicula!=null){
				categoriaPorPeliculaDAO.insert(categoriaPorPelicula);
				
			}
			else{
			
				throw new ServiceException( "La categoriaporpelicula que se quiere añadir es un NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException(e.getMessage());
			}
		
	}

	@Override
	public void delete(CategoriasPorPelicula categoriaPorPelicula) throws ServiceException{
		TransactionManager daoManager=null;
		try{
			daoManager=new TransactionManager();
			ICategoriasPorPeliculaDAO categoriaPorPeliculaDAO=daoManager.getCategoriasPorPeliculaDAO();
			if(categoriaPorPelicula!=null){
				categoriaPorPeliculaDAO.delete(categoriaPorPelicula);
				
			}
			else{
			
				throw new ServiceException( "La categoriaporpelicula que se quiere borrar es NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException("Problema en delete categoriaporPelicula  "+e.getMessage());
			}
		
	}



	@Override
	public List<CategoriasPorPelicula> findCategoriasPorPeliculaByIdCategoria(Categorias categoria) throws ServiceException{
		TransactionManager daoManager = null;
		List<CategoriasPorPelicula>  categoriasPorPelicula= new ArrayList<CategoriasPorPelicula>();
		
		try {
			
				daoManager = new TransactionManager();
				ICategoriasPorPeliculaDAO categoriasPorPeliculaDAO = daoManager.getCategoriasPorPeliculaDAO ();
				categoriasPorPelicula = categoriasPorPeliculaDAO.findCategoriasPorPeliculaByIdCategoria(categoria);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findCategoriasPorPeliculaByIdCategoria "+e.getMessage());

		}
		
		return categoriasPorPelicula;
	}

}
