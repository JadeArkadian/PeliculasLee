package es.lucatic.peliculaslee.com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.lucatic.peliculaslee.com.daos.TransactionManager;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;
import es.lucatic.peliculaslee.com.interfaces.daos.IUsuariosDAO;
import es.lucatic.peliculaslee.com.interfaces.services.IUsuariosService;

public class UsuariosService implements IUsuariosService {
private IUsuariosDAO usuarioDAO;
	
	public UsuariosService() 
	{
		
	}

	@Override
	public boolean insertUsuario(Usuarios usuario) throws ServiceException{

		TransactionManager daoManager = null;
		Usuarios user = null;
		boolean creado = false;
		try {
			daoManager = new TransactionManager();//Creaba la conexion
			IUsuariosDAO userDAO = daoManager.getUsuarioDAO();
			if (userDAO.findUsuariosByUsername(usuario) == null){
				userDAO.insertUsuario(usuario);
			} else{
				throw new ServiceException("El usuario ya existia, usa otro nombre de usuario");
			}
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}
		return creado;
	}

	@Override
	public Usuarios findUsuariosByUsername(Usuarios usuario) throws ServiceException{
		TransactionManager daoManager = null;
		Usuarios usuarioEncontrado = null;
		try {
			if(usuario.getUsername() != null){
				daoManager = new TransactionManager();
				IUsuariosDAO usuDAO = daoManager.getUsuarioDAO();
				usuarioEncontrado = usuDAO.findUsuariosByUsername(usuario);
			}else {
				throw new ServiceException("Porfavor introduzca el usuario...");
			}
		} catch (DAOException e) {
			throw new DAOException(e.getMessage());
		}
		return usuarioEncontrado;
	}

	@Override
	public void updateUsuario(Usuarios usuario) throws ServiceException{
		TransactionManager daoManager = null;
		boolean modificado = false;
		try {
			daoManager = new TransactionManager();//Creaba la conexion
			daoManager.getUsuarioDAO().updateUsuario(usuario);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}
	}
	public void deleteUsuario(Usuarios usuario)throws ServiceException {
		
		TransactionManager daoManager = null;
		try {
			daoManager = new TransactionManager();//Creaba la conexion
			daoManager.getUsuarioDAO().deleteUsuario(usuario);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}
	}
	
	


	

}
