package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.interfaces.services.IComentariosService;
import es.lucatic.peliculaslee.com.service.ComentariosService;
import es.lucatic.peliculaslee.com.utils.Pair;

@Controller
public class ComentarController 

{
	public ComentarController() 
	{
	}
	
	
	@RequestMapping( value = "/escribirComentario", method = RequestMethod.POST )
	public ModelAndView altaComentario( HttpServletRequest request) 
	{
		String comentarioInput = request.getParameter("comentarioInput");
		String pagina="pelicula";
		HttpSession session = request.getSession(true);
		
		IComentariosService comentariosService= new ComentariosService();
		
		Peliculas peliculaActual = (Peliculas) session.getAttribute("peliculaActual");
		Usuarios usuarioActual = (Usuarios) session.getAttribute("usuario");
		
		// Creamos el comentario
		Comentarios comentario= new Comentarios();
		comentario.setComentario(comentarioInput);
		comentario.setIdPelicula(peliculaActual.getIdPelicula());
		comentario.setUsername(usuarioActual.getUsername());
		
		comentariosService.insertComentario(comentario); 
				
		// Refrescamos los comentarios de la pagina actual
		List<Comentarios> comentarios = comentariosService.findComentariosByIdPelicula(peliculaActual);
		
		// Ver comentarios de VerPeliculaController.java
		List<Pair<String,String>> authorsAndComments = new ArrayList<Pair<String,String>> ();
		
		for(int i=0;i<comentarios.size();i++)
		{	
			String commentText = comentarios.get(i).getComentario();
			String commentUsername = comentarios.get(i).getUsername();
			
			Pair<String,String> aux = new Pair<String,String>(commentUsername,commentText); 
			
			authorsAndComments.add(aux);
		}
		
		session.setAttribute("usuariosComentarios", authorsAndComments);
		
		return new ModelAndView(pagina);		
			
	}
}
