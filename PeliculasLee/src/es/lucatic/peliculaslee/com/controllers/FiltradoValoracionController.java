package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Valoraciones;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.interfaces.services.IValoracionesService;
import es.lucatic.peliculaslee.com.service.PeliculasService;
import es.lucatic.peliculaslee.com.service.ValoracionesService;

//ESTE CONTROLER FILTRA LAS CATEGORIAS DE MAS A MENOS VALORACION
@Controller
public class FiltradoValoracionController {

	public FiltradoValoracionController() {
		}
	
		// TODO Auto-generated constructor stub
				@RequestMapping( value = "/filtrarByValoracion",method = RequestMethod.POST )
				
				public ModelAndView filtrarByValoracion(HttpServletRequest request) {
					String mensaje="";
					String pagina="index";
					HttpSession session = request.getSession(true);
					Categorias categoria= new Categorias();
					List<Peliculas> peliculas=new ArrayList<Peliculas>();
					List<Valoraciones> valoraciones=new ArrayList<Valoraciones>();
					IPeliculasService peliculasService= new PeliculasService();
					IValoracionesService valoracionesService= new ValoracionesService();
					Peliculas pelicula =new Peliculas();
					Valoraciones valoracion=new Valoraciones();
					
					peliculas=peliculasService.findAllPeliculas();
					//Aqui guardamos 1 valoracion media por cada pelicula.
					for(int i=0;i<peliculas.size();i++){
						valoracion.setIdPelicula(peliculas.get(i).getIdPelicula());
						valoracion.setValoracion(valoracionesService.searchAVG(peliculas.get(i)));
						valoraciones.add(valoracion);
					}
				
					//Aqui ordenamos la valoraciones de mayor a menor valoración.
					  for(int i=0;i<valoraciones.size();i++){
				
						  for(int j=0;j<valoraciones.size();j++){
							  if(valoraciones.get(i).getValoracion()<valoraciones.get(j).getValoracion()){
								  Valoraciones aux=valoraciones.get(i);
								  valoraciones.add(i, valoraciones.get(j));
								  valoraciones.add(j, aux);
								  
							  }
							 
						  }
					  }
					for(int i=0;i<valoraciones.size();i++){
						pelicula.setIdPelicula(valoraciones.get(i).getIdPelicula());
						pelicula=peliculasService.findPeliculaByIdPelicula(pelicula);
						peliculas.add(pelicula);
					}
					  
					session.setAttribute("peliculas", peliculas);
					
					return new ModelAndView(pagina);
					
					
					
	

				}
}
