package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.interfaces.services.IValoracionesService;
import es.lucatic.peliculaslee.com.service.ValoracionesService;


//En este controler recogemos la valoracion del usuario y la registramos
@Controller
public class ValorarController {

	public ValorarController() {
		}
	
	@RequestMapping(value = "/valorar", method = RequestMethod.GET)
		public ModelAndView valorar ( HttpServletRequest request) {
			String pagina = "pelicula";
			HttpSession session = request.getSession(true);
			int numValoracion=0;
			Peliculas peliculaActual= new Peliculas();
			Usuarios usuario= new Usuarios();
			Valoraciones valoracion= new Valoraciones();
			List<Valoraciones> valoraciones= new ArrayList<Valoraciones>();
			IValoracionesService valoracionesService= new ValoracionesService();
			
			peliculaActual=(Peliculas) session.getAttribute("peliculaActual");
			usuario= (Usuarios) session.getAttribute("usuario");
			numValoracion=Integer.parseInt(request.getParameter("estrellas"));
			usuario= (Usuarios) session.getAttribute("usuario");
			valoracion.setIdPelicula(peliculaActual.getIdPelicula());
			valoracion.setUsername(usuario.getUsername());
			valoracionesService.insert(valoracion);
			valoraciones=valoracionesService.findValoracionesByIdPelicula(peliculaActual);
			session.setAttribute("valoracionPeliculaActual", valoraciones);
			return new ModelAndView(pagina);
			}
	

}
