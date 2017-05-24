package es.lucatic.peliculaslee.com.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.IncorrectResultSizeDataAccessException;


import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.PeliculasMapper;

public class PeliculasService implements IPeliculasService {

	public PeliculasService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertPelicula(Peliculas pelicula) {
		
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			IPeliculasDAO peliculaDAO=daoManager.getPeliculasDAO();
			if(pelicula!=null){
				peliculaDAO.insertPelicula(pelicula);
				
			}
			else{
			
				throw new ServiceException( "La pelicula que se quiere añadir es un NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException(e.getMessage());
			}
		
	}

	@Override
	public List<Peliculas> findAllPeliculas() {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findAllPeliculas();
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema listando todas las peliculas  "+e.getMessage());

		}
		
		return peliculas;
	}



	@Override
	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula) {
		TransactionManager daoManager = null;
			
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				pelicula = peliculasDAO.findPeliculaByIdPelicula(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByIdPelicula "+e.getMessage());

		}
		
		return pelicula;
		}
	
	
	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByTitulo(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByTitulo "+e.getMessage());

		}
		
		return peliculas;
		}
	
	public List<Peliculas> findPeliculasByTituloLike(String cadena) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByTituloLike(cadena);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByTituloLike "+e.getMessage());

		}
		
		return peliculas;
		}
	
	public List<Peliculas> findPeliculasByAnio(int anio) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByAnio(anio);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByAnio "+e.getMessage());

		}
		
		return peliculas;
		}
	public List<Peliculas> findPeliculasByDirector(String director) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByDirector(director);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByDirector "+e.getMessage());

		}
		
		return peliculas;
		}
	
	
	public List<Peliculas> findPeliculasByUsername(Peliculas pelicula) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByUsername(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByUsername "+e.getMessage());

		}
		
		return peliculas;
		}
	
	
	
	public List<Peliculas> findLast12Peliculas() {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findLast12Peliculas();
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findLast12Peliculas "+e.getMessage());

		}
		
		return peliculas;
		}
	
	
	public List<Peliculas> findPeliculasWithAnioHigherThan(int anio) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasWithAnioHigherThan(anio);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByAnioHigherThan "+e.getMessage());

		}
		
		return peliculas;
	}
	
	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio) {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasWithAnioLowerThan(anio);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByAnioLowerThan "+e.getMessage());

		}
		
		return peliculas;
	}
	
	

	public void deletePelicula(Peliculas pelicula) {
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			IPeliculasDAO peliculaDAO=daoManager.getPeliculasDAO();
			if(pelicula!=null){
				peliculaDAO.deletePelicula(pelicula);
				
			}
			else{
			
				throw new ServiceException( "La pelicula que se quiere borrar es NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException("Problema en deletePelicula  "+e.getMessage());
			}
	}
		

	public void updatePelicula(Peliculas pelicula) {
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			IPeliculasDAO peliculaDAO=daoManager.getPeliculasDAO();
			if(pelicula!=null){
				peliculaDAO.updatePelicula(pelicula);
				
			}
			else{
			
				throw new ServiceException( "La pelicula que se quiere modificar es NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException("Problema en updatePelicula "+e.getMessage());
			}
	}

	@Override
	public List<Peliculas> findPeliculaByLetra(String letraEscogida) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

	
}
