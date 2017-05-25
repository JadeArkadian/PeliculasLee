package es.lucatic.peliculaslee.com.daos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Reorganizado TransactionManager para crear los beans y conexion en lugar de hacerlo
 * en los Services.
 * @author Jade Arkadian
 *
 */
public class TransactionManager 
{
	
	private ApplicationContext context;
	
	
	public TransactionManager() 
	{
		this.context = new ClassPathXmlApplicationContext("dataSource.xml");
	}
	
	//Metodos que devuelve un DAO
	public PeliculasDAO getPeliculasDAO()
	{
		PeliculasDAO peliculasDAO = context.getBean("PeliculasDAO",PeliculasDAO.class);
		return peliculasDAO;
	}
	
	public UsuariosDAO getUsuarioDAO()
	{
		UsuariosDAO usuariosDao = context.getBean("UsuariosDAO",UsuariosDAO.class);
		return usuariosDao;
	}
	
	public CategoriasDAO getCategoriasDAO()
	{
		CategoriasDAO categoriasDAO = context.getBean("CategoriasDAO",CategoriasDAO.class);
		return categoriasDAO;
	}
	
	public ComentariosDAO getComentariosDAO()
	{
		ComentariosDAO comentariosDAO = context.getBean("ComentariosDAO",ComentariosDAO.class);
		return comentariosDAO;
	}

	
	public CategoriasPorPeliculaDAO getCategoriasPorPeliculaDAO() 
	{
		CategoriasPorPeliculaDAO categoriasPorPeliculaDAO = context.getBean("CategoriasPorPeliculaDAO",CategoriasPorPeliculaDAO.class);
		return categoriasPorPeliculaDAO;
	}

	public ValoracionesDAO getValoracionesDAO() 
	{
		ValoracionesDAO valoracionesDAO = context.getBean("ValoracionesDAO",ValoracionesDAO.class);
		return valoracionesDAO;
	}
	
}
