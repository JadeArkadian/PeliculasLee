package es.lucatic.peliculaslee.com.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.IncorrectResultSizeDataAccessException;


import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.PeliculasMapper;

public class PeliculasService implements IPeliculasService {

	public PeliculasService() 
	{
	}

	@Override
	public void insertPelicula(Peliculas pelicula) throws ServiceException {
		
		TransactionManager daoManager=null;
		
		try
		{
			daoManager=new TransactionManager();
			IPeliculasDAO peliculaDAO=daoManager.getPeliculasDAO();
			
			if(pelicula!=null)
			{
				peliculaDAO.insertPelicula(pelicula);	
			}
			else
			{
				throw new ServiceException( "La pelicula que se quiere a�adir es un NULL");		
			}
		}
		catch(DAOException e)
		{	
			throw new ServiceException(e.getMessage());
		}
		
	}

	@Override
	public List<Peliculas> findAllPeliculas() throws ServiceException {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		try 
		{
				System.out.println("hola1");
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findAllPeliculas();
			
		} 
		catch (DAOException e) 
		{
			System.out.println("hola error");
			throw new ServiceException("Problema listando todas las peliculas  "+e.getMessage());
		}
		
		return peliculas;
	}

	@Override
	public Peliculas findPeliculaByIdPelicula(Peliculas pelicula)throws ServiceException 
	{
		TransactionManager daoManager = null;
			
		try 
		{
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				pelicula = peliculasDAO.findPeliculaByIdPelicula(pelicula);
			
		} 
		catch (DAOException e) 
		{	
			throw new ServiceException("Problema en findPeliculaByIdPelicula "+e.getMessage());
		}
		
		return pelicula;
	}
	
	
	public List<Peliculas> findPeliculasByTitulo(Peliculas pelicula)throws ServiceException {
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
	
	public List<Peliculas> findPeliculasByTituloLike(String cadena)throws ServiceException {
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
	
	public List<Peliculas> findPeliculasByAnio(int anio)throws ServiceException {
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
	public List<Peliculas> findPeliculasByDirector(String director)throws ServiceException {
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
	
	
	/*public List<Peliculas> findPeliculasByUsername(Usuarios usuario)throws ServiceException {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByUsername(usuario);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findPeliculaByUsername "+e.getMessage());

		}
		
		return peliculas;
		}
	
	*/
	
	public List<Peliculas> findLast12Peliculas() throws ServiceException{
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
	
	public List<Peliculas> findPeliculasWithAnioLowerThan(int anio)throws ServiceException {
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
	
	

	public void deletePelicula(Peliculas pelicula)throws ServiceException {
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
		

	public void updatePelicula(Peliculas pelicula)throws ServiceException{
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
	public List<Peliculas> findPeliculasByTituloWhichStartsWith(String letraEscogida)throws ServiceException {
		TransactionManager daoManager = null;
		List<Peliculas>  peliculas = new ArrayList<Peliculas>();
		
		try {
			
				daoManager = new TransactionManager();
				IPeliculasDAO peliculasDAO = daoManager.getPeliculasDAO();
				peliculas = peliculasDAO.findPeliculasByTituloWhichStartsWith(letraEscogida);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en ffindPeliculasByTituloWhichStartsWith "+e.getMessage());

		}
		
		return peliculas;
		}
	
	

	


	

	
}
