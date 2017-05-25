package es.lucatic.peliculaslee.com.interfaces.daos;

import es.lucatic.peliculaslee.com.domains.Administradores;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IAdministradoresDAO{
	public Administradores findById(Administradores administrador) throws DAOException;
}
