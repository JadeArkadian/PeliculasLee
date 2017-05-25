package es.lucatic.peliculaslee.com.interfaces.daos;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.exceptions.DAOException;

public interface IComentariosDAO{
	public List<Comentarios> findAllComentarios()throws DAOException;
	public Comentarios findComentarioByIdPeliculaAndUsername(Comentarios comentario)throws DAOException;
	public List<Comentarios> findComentariosByIdPelicula(Comentarios comentario)throws DAOException;
	public List<Comentarios> findComentariosByUsername(Comentarios comentario)throws DAOException;
	public int countComentariosByIdPelicula(Comentarios comentario) throws DAOException;
	public void insertComentario(Comentarios comentario) throws DAOException;
	public void deleteComentario(Comentarios comentario);
	}