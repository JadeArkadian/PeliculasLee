package es.lucatic.peliculaslee.com.service;

import java.util.ArrayList;
import java.util.List;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IComentariosDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.services.IComentariosService;

public class ComentariosService implements IComentariosService{

	public ComentariosService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Comentarios> findAllComentarios() throws ServiceException {
		TransactionManager daoManager = null;
		List<Comentarios> comentarios= new ArrayList<Comentarios>();
		
		try {
			
				daoManager = new TransactionManager();
				IComentariosDAO comentariosDAO = daoManager.getComentariosDAO();
				comentarios= comentariosDAO.findAllComentarios();
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findAllComentarios "+e.getMessage());

		}
		
		return comentarios;
		
	}

	@Override
	public Comentarios findComentarioByIdPeliculaAndUsername(Comentarios comentario) throws ServiceException {
		TransactionManager daoManager = null;
		Comentarios comentarios= new Comentarios();
		
		try {
			
				daoManager = new TransactionManager();
				IComentariosDAO comentariosDAO = daoManager.getComentariosDAO();
				comentarios= comentariosDAO.findComentarioByIdPeliculaAndUsername(comentario);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findComentariosByIdPeliculaAndUsername "+e.getMessage());

		}
		
		return comentarios;
	}

	@Override
	public List<Comentarios> findComentariosByIdPelicula(Peliculas pelicula) throws ServiceException {
		TransactionManager daoManager = null;
		List<Comentarios> comentarios= new ArrayList<Comentarios>();
		
		try {
			
				daoManager = new TransactionManager();
				IComentariosDAO comentariosDAO = daoManager.getComentariosDAO();
				comentarios= comentariosDAO.findComentariosByIdPelicula(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findComentariosByIdPelicula "+e.getMessage());

		}
		
		return comentarios;
		
	}

	@Override
	public List<Comentarios> findComentariosByUsername(Usuarios usuario) throws ServiceException {
		TransactionManager daoManager = null;
		List<Comentarios> comentarios= new ArrayList<Comentarios>();
		
		try {
			
				daoManager = new TransactionManager();
				IComentariosDAO comentariosDAO = daoManager.getComentariosDAO();
				comentarios= comentariosDAO.findComentariosByUsername(usuario);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en findComentariosByUsername"+e.getMessage());

		}
		
		return comentarios;
		}
	

	@Override
	public int countComentariosByIdPelicula(Peliculas pelicula) throws ServiceException {
		
		TransactionManager daoManager = null;
		int cuenta=0;
		
		try {
			
				daoManager = new TransactionManager();
				IComentariosDAO comentariosDAO = daoManager.getComentariosDAO();
				 cuenta=comentariosDAO.countComentariosByIdPelicula(pelicula);
			

			
		} catch (DAOException e) {
			
			throw new ServiceException("Problema en countComentariosByIdPelicula "+e.getMessage());

		}
		
		return cuenta;
		}
	
	
	@Override
	public void insertComentario(Comentarios comentario) throws ServiceException {
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			IComentariosDAO comentarioDAO=daoManager.getComentariosDAO();
			if(comentario!=null){
				comentarioDAO.insertComentario(comentario);
				
			}
			else{
			
				throw new ServiceException( "El comentario que se quiere añadir es un NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException(e.getMessage());
			}
		
		
	}

	@Override
	public void deleteComentario(Comentarios comentario) throws ServiceException {
		TransactionManager daoManager=null;
		
		try{
			daoManager=new TransactionManager();
			IComentariosDAO comentarioDAO=daoManager.getComentariosDAO();
			if(comentario!=null){
				comentarioDAO.deleteComentario(comentario);
				
			}
			else{
			
				throw new ServiceException( "El comentario que se borrar añadir es un NULL");
			
			}
		}
			catch(DAOException e){
			
				throw new ServiceException(e.getMessage());
			}
		
	}

	


	

}
