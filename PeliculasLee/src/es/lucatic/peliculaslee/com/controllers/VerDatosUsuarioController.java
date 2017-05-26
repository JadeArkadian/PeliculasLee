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
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.service.ComentariosService;
import es.lucatic.peliculaslee.com.service.PeliculasService;

@Controller
public class VerDatosUsuarioController {

	public VerDatosUsuarioController() {
		
	}
	// TODO Auto-generated constructor stub
			@RequestMapping( value = "/perfil", method = RequestMethod.GET )
			public ModelAndView verComentarios( HttpServletRequest request) {
			String pagina="perfil";
			HttpSession session = request.getSession(true);
			Comentarios comentario= new Comentarios();
			List<Comentarios> comentariosUsuario=new ArrayList<Comentarios>();
			IComentariosService comentariosService= new ComentariosService();
			Usuarios usuario= new Usuarios();
			usuario= (Usuarios) session.getAttribute("usuario");
			comentariosUsuario=comentariosService.findComentariosByUsername(usuario);
			List<Peliculas> peliculasComentadasUsuario= new ArrayList<Peliculas>();
			IPeliculasService peliculasService=new PeliculasService();
			Peliculas pelicula= new Peliculas();
			if(comentariosUsuario == null){
				request.setAttribute("mensaje", "No has comentado ninguna pelicula aun...");
			}else{
				for(int i=0;i<comentariosUsuario.size();i++){
					pelicula.setIdPelicula(comentariosUsuario.get(i).getIdPelicula());
					peliculasComentadasUsuario.add(peliculasService.findPeliculaByIdPelicula(pelicula));
					
				}
				
				session.setAttribute("comentariosUsuario", comentariosUsuario);
				session.setAttribute("peliculasComentadasUsuario", peliculasComentadasUsuario);
			}
			
			return new ModelAndView(pagina);
			
			
			
			}
}
