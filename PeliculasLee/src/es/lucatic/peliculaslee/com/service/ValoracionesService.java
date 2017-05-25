package es.lucatic.peliculaslee.com.service;

import java.util.ArrayList;
import java.util.List;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IComentariosDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IValoracionesDAO;
import es.lucatic.peliculaslee.com.interfaces.services.IValoracionesService;

public class ValoracionesService implements IValoracionesService {

	public ValoracionesService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Valoraciones findValoracionesByIdPeliculaAndUsername(Valoraciones valoracion) throws ServiceException {
		TransactionManager daoManager = null;
		Valoraciones valoraciones= new Valoraciones();
		
		try {
			
				daoManager = new TransactionManager();
				IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				valoraciones= valoracionesDAO.findValoracionesByIdPeliculaAndUsername(valoracion);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findValoracionesByIdPeliculaAndUsername"+e.getMessage());

		}
		
		return  valoraciones;
		}
	

	@Override
	public List<Valoraciones> findValoracionesByIdPelicula(Peliculas pelicula) throws ServiceException {
		TransactionManager daoManager = null;
		List<Valoraciones> valoraciones= new ArrayList<Valoraciones>();
		
		try {
			
				daoManager = new TransactionManager();
				IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				valoraciones= valoracionesDAO.findValoracionesByIdPelicula(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findValoracionesByIdPelicula"+e.getMessage());

		}
		
		return  valoraciones;
		}
	
	

	@Override
	public List<Valoraciones> findValoracionesByUsername(Usuarios usuario) throws ServiceException {
		TransactionManager daoManager = null;
		List<Valoraciones> valoraciones= new ArrayList<Valoraciones>();
		
		try {
			
				daoManager = new TransactionManager();
				IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				valoraciones= valoracionesDAO.findValoracionesByUsername(usuario);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findValoracionesByUsername"+e.getMessage());

		}
		
		return  valoraciones;
		}
	

	@Override
	public int countValoracionesByValoracionAndPelicula(Valoraciones valoracion) throws ServiceException {
		TransactionManager daoManager = null;
		int cuenta=0;
		
		try {
			
			daoManager = new TransactionManager();
			IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				 cuenta=valoracionesDAO.countValoracionesByValoracionAndPelicula(valoracion);

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en countValoracionesByValoracionAndPelicula "+e.getMessage());

		}
		
		return cuenta;
		}
	

	@Override
	public int countValoracionesByIdPelicula(Peliculas peliculas) throws ServiceException {
		TransactionManager daoManager = null;
		int cuenta=0;
		
		try {
			
			daoManager = new TransactionManager();
			IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				 cuenta=valoracionesDAO.countValoracionesByIdPelicula(peliculas);

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en countValoracionesByIdPelicula "+e.getMessage());

		}
		
		return cuenta;
		
	}

	@Override
	public Double avgValoracionesByPelicula(Peliculas peliculas) throws ServiceException {
		TransactionManager daoManager = null;
		double cuenta=0;
		
		try {
			
			daoManager = new TransactionManager();
			IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
				 cuenta=valoracionesDAO.avgValoracionesByPelicula(peliculas);

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en avgValoracionesByPelicula "+e.getMessage());

		}
		
		return cuenta;
	}

	@Override
	public void insert(Valoraciones valoracion) throws ServiceException {
	TransactionManager daoManager=null;
		
		try{
			daoManager = new TransactionManager();
			IValoracionesDAO valoracionesDAO = daoManager.getValoracionesDAO();
			if(valoracion!=null){
				valoracionesDAO.insert(valoracion);
				
			}
			else{
			
				throw new ServiceException( "La valoracion que se quiere añadir es un NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException(e.getMessage());
			}
		
		
		
	}

	

	
}
