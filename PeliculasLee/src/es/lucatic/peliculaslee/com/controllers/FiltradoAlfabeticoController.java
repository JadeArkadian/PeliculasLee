package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.service.PeliculasService;


public class FiltradoAlfabeticoController {
	/* MAPEO del href del controlador.
	@RequestMapping( value = "/filtrarporletra", method = RequestMethod.GET )
	
	/* METODO QUE RECOGE LOS DATOS DEL FORMULARIO. */
	public ModelAndView indicePelicula(HttpServletRequest request) {
		//Se recoge por parametro del href:\\Controlador?letra="letraSeleccionada" que se implementa en el html
		String letraEscogida = request.getParameter("letra");
		PeliculasService peliService = new PeliculasService();
		ArrayList<Peliculas> peliculasFiltradasLetra = (ArrayList<Peliculas>) peliService.findPeliculasByTituloWhichStartsWith(letraEscogida);
		//Subo a la nube las peliculas filtradas en arrayList
		request.getSession().setAttribute("peliculas", peliculasFiltradasLetra);//Machaca el atributo peliculas y lo remplaza.
		//Depende de si implementamos la vista de busqueda avanzada
		return new ModelAndView("index");
	}
}
