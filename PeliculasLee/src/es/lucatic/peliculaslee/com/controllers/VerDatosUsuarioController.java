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
import es.lucatic.peliculaslee.com.utils.Pair;

@Controller
public class VerDatosUsuarioController {

	public VerDatosUsuarioController() {
		
	}
	// TODO Auto-generated constructor stub
			@RequestMapping( value = "/perfil", method = RequestMethod.GET )
			public ModelAndView verComentarios( HttpServletRequest request) 
			{
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
				
				if(comentariosUsuario == null)
				{
					request.setAttribute("mensaje", "No has comentado ninguna pelicula aun...");
				}
				else
				{
					
					List<Pair<String,String>> peliculasAndComentarios = new ArrayList<Pair<String,String>> ();
					
					for(int i=0;i<comentariosUsuario.size();i++)
					{
						
						pelicula.setIdPelicula(comentariosUsuario.get(i).getIdPelicula());
						pelicula= peliculasService.findPeliculaByIdPelicula(pelicula);
						
						Pair<String,String> aux = new Pair<String,String> (pelicula.getTitulo() ,comentariosUsuario.get(i).getComentario());
						peliculasAndComentarios.add(aux);
						
						

						
						System.out.println( comentariosUsuario.get(i).getComentario() );
						
//						peliculasAndComentarios.get(i).setValue2 ( comentariosUsuario.get(i).getComentario() );
//						peliculasAndComentarios.get(i).setValue1 ( pelicula.getTitulo());
	
					}
					
					
					session.setAttribute("peliculasAndComentarios", peliculasAndComentarios);
				}
				
				return new ModelAndView(pagina);
			
			
			
			}
}
