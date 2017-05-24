package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Comentarios;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.interfaces.services.IComentariosService;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.interfaces.services.IValoracionesService;
import es.lucatic.peliculaslee.com.service.ComentariosService;
import es.lucatic.peliculaslee.com.service.PeliculasService;
import es.lucatic.peliculaslee.com.service.ValoracionesService;

@Controller
public class VerPeliculaController {

	public VerPeliculaController() {
		
	
	}


	// TODO Auto-generated constructor stub
			@RequestMapping( value = "/verPelicula",method = RequestMethod.POST )
			
			public ModelAndView filtrarByValoracion(HttpServletRequest request) {
				String mensaje="";
				String pagina="pelicula";
				
				HttpSession session = request.getSession(true);
				Peliculas pelicula=new Peliculas();
				IPeliculasService peliculasService= new PeliculasService();
			
				double valoracion=0;
				IValoracionesService valoracionesService= new ValoracionesService();
				List<Valoraciones> valoraciones= new ArrayList<Valoraciones>();
				IComentariosService comentariosService= new ComentariosService();
				List<Comentarios> comentarios= new ArrayList<Comentarios>();
				
				
				
				pelicula.setIdPelicula(Integer.parseInt(request.getParameter("idPelicula")));
				pelicula=peliculasService.findPeliculaByIdPelicula(pelicula);
				session.setAttribute("peliculaActual", pelicula);
				valoracion=valoracionesService.searchAVG(pelicula);
				session.setAttribute("valoracionPeliculaActual", valoracion);
				comentarios=comentariosService.list(pelicula);
				
				session.setAttribute("ComentariosPeliculaActual", comentarios);
				
				
				
				
				return new ModelAndView(pagina);
				
				
				


			}
}
