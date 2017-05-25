package es.lucatic.peliculaslee.com.interfaces.services;

import java.util.List;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.exceptions.ServiceException;

import es.lucatic.peliculaslee.com.domains.Comentarios;

public interface IComentariosService {

	public List<Comentarios> findAllComentarios()throws ServiceException;
	public Comentarios findComentarioByIdPeliculaAndUsername(Comentarios comentario)throws ServiceException;
	public List<Comentarios> findComentariosByIdPelicula(Peliculas pelicula)throws ServiceException;
	public List<Comentarios> findComentariosByUsername(Usuarios usuario)throws ServiceException;
	public int countComentariosByIdPelicula(Peliculas pelicula) throws ServiceException;
	public void insertComentario(Comentarios comentario) throws ServiceException;
	public void deleteComentario(Comentarios comentario)throws ServiceException;;
}


