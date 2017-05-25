package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.interfaces.services.IComentariosService;
import es.lucatic.peliculaslee.com.service.ComentariosService;

@Controller
public class ComentarController {
	

	public ComentarController() {
		}
	
		@RequestMapping( value = "/escribirComentario", method = RequestMethod.POST )
		public ModelAndView altaComentario( HttpServletRequest request) {
		String coment = request.getParameter("comentario");
		String pagina="pelicula";
		HttpSession session = request.getSession(true);
		Comentarios comentario= new Comentarios();
		List<Comentarios> comentariosPelicula=new ArrayList<Comentarios>();
		Peliculas peliculaActual= new Peliculas();
		Usuarios usuarioActual= new Usuarios();
		IComentariosService comentariosService= new ComentariosService();
		
		
		peliculaActual= (Peliculas) session.getAttribute("peliculaActual");
		usuarioActual=(Usuarios) session.getAttribute("usuario");
		comentario.setComentario(coment);
		comentario.setIdPelicula(peliculaActual.getIdPelicula());
		comentario.setUsername(usuarioActual.getUsername());
		comentariosService.insertComentario(comentario); 
		comentariosPelicula=comentariosService.findComentariosByIdPelicula(peliculaActual);
		
		session.setAttribute("comentariosPeliculaActual", comentariosPelicula);
		
		return new ModelAndView(pagina);
				
				
				
		}
}
