package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.interfaces.services.ICategoriasService;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.service.CategoriasService;
import es.lucatic.peliculaslee.com.service.PeliculasService;

public class FiltradoAnioController {
	@RequestMapping( value = "/filtraranio", method = RequestMethod.POST )
	// ANOTACION DE QUE VA A RECIBIR UN PRODUCTO. SIN LA ANOTACION NO FUNCIONA
	public ModelAndView FiltradoPorAnio(HttpServletRequest request) {

		List<Peliculas> peliculas=new ArrayList<Peliculas>();
		IPeliculasService peliculasService= new PeliculasService();	
		Peliculas pelicula = new Peliculas();

		//Valores que se reciben mediante get por href--> controlador?comparar=*,anio=*

		int anio = Integer.valueOf(request.getParameter("anio"));
		String comparar = request.getParameter("comparar");	
		pelicula.setAnio(anio);
		
		//Si es menor uso una Query y si es mayor uso la otra
		if(comparar.equals("<")){
			peliculas = peliculasService.findPeliculasWithAnioLowerThanQuery(anio);
		} else if(comparar.equals(">")){
			peliculas = peliculasService.findPeliculasWithAnioHigherThanQuery(anio);
		}
		
		request.getSession().setAttribute("peliculas", peliculas);//Machaca el atributo peliculas y lo remplaza con las filtradas
		//Depende de si implementamos la vista de busqueda avanzada
		return new ModelAndView("index");
		
	}
}
