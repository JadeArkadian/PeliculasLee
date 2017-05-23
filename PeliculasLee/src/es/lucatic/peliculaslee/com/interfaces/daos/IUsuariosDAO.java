package es.lucatic.peliculaslee.com.interfaces.daos;

import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IUsuariosDAO{
	public Usuarios findUsuariosByUsername(Usuarios usuario) throws DAOException;
	public void insertUsuario(Usuarios usuario) throws DAOException;
	public void updateUsuario(Usuarios usuario) throws DAOException;
	public void deleteUsuario(Usuarios usuario) throws DAOException;
	
}
