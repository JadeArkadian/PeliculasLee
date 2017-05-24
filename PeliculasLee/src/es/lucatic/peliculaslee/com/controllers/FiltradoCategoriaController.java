package es.lucatic.peliculaslee.com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Categorias;
import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;
import es.lucatic.peliculaslee.com.domains.Peliculas;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.interfaces.services.ICategoriasPorPeliculaService;
import es.lucatic.peliculaslee.com.interfaces.services.ICategoriasService;
import es.lucatic.peliculaslee.com.interfaces.services.IPeliculasService;
import es.lucatic.peliculaslee.com.interfaces.services.IUsuariosService;
import es.lucatic.peliculaslee.com.service.CategoriasPorPeliculaService;
import es.lucatic.peliculaslee.com.service.CategoriasService;
import es.lucatic.peliculaslee.com.service.PeliculasService;
import es.lucatic.peliculaslee.com.service.UsuariosService;

/* ESTE CONTROLER FILTRA LAS PELICULAS POR CATEGORIAS*/
@Controller
public class FiltradoCategoriaController {

	public FiltradoCategoriaController() {
		
	}
	
		// TODO Auto-generated constructor stub
		@RequestMapping( value = "/filtrarcategoria", method = RequestMethod.POST )
		// ANOTACION DE QUE VA A RECIBIR UN PRODUCTO. SIN LA ANOTACION NO FUNCIONA
		public ModelAndView filtrarCategoria(HttpServletRequest request) {
			String mensaje="";
			String pagina="../index";
			HttpSession session = request.getSession(true);
			Categorias categoria= new Categorias();
			List<Peliculas> peliculas=new ArrayList<Peliculas>();
			IPeliculasService peliculasService= new PeliculasService();
			Peliculas pelicula=new Peliculas();
			ICategoriasPorPeliculaService	categoriasPorPeliculaService= new CategoriasPorPeliculaService();
			List<CategoriasPorPelicula> PeliculasPorCategoria= new ArrayList<CategoriasPorPelicula> ();
			ICategoriasService categoriasService= new CategoriasService();
			categoria.setIdCategoria(Integer.parseInt(request.getParameter("idCategoria")));
			categoria=categoriasService.findByIdCategoria(categoria);
			PeliculasPorCategoria=categoriasPorPeliculaService.findByCategoria(categoria);
			
			for(int i=0;i<PeliculasPorCategoria.size();i++){
				pelicula.setIdPelicula(PeliculasPorCategoria.get(i).getIdPelicula());
				
						peliculas.add(peliculasService.findPeliculaByIdPelicula(pelicula));
			}
			

			session.setAttribute("peliculas", peliculas);
			
			
			
		
			

			
					
			return new ModelAndView(pagina);
			
		}
	

}
