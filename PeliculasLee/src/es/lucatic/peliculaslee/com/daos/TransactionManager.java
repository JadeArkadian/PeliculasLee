package es.lucatic.peliculaslee.com.daos;

import java.sql.Connection;

import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.ICategoriasPorPeliculaDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IComentariosDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IPeliculasDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IUsuariosDAO;
import es.lucatic.peliculaslee.com.interfaces.daos.IValoracionesDAO;

import es.lucatic.peliculaslee.com.daos.*;

// Esta clase la va a utilizar el service. Cuando me creo un objeto de esta clase, crea la conexion automaticamente

public class TransactionManager {
	
	public TransactionManager() {
	
	}
	
	//Metodos que devuelve un DAO
	public IPeliculasDAO getPeliculasDAO(){
		 return new PeliculasDAO();
	}
	
	public IUsuariosDAO getUsuarioDAO(){
		return new UsuariosDAO();
	}
	

	
	public ICategoriasDAO getCategoriasDAO(){
		return new CategoriasDAO();
	}
	public IComentariosDAO getComentariosDAO(){
		return new ComentariosDAO();
	}

	
	public ICategoriasPorPeliculaDAO getCategoriasPorPeliculaDAO() {
		// TODO Auto-generated method stub
		return new CategoriasPorPeliculaDAO();
	}

	public IValoracionesDAO getValoracionesDAO() {
		// TODO Auto-generated method stub
		return new ValoracionesDAO();
	}
	
}
