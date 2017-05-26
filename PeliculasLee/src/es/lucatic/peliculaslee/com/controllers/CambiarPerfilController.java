package es.lucatic.peliculaslee.com.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CambiarPerfilController {
	@RequestMapping( value = "/modificarUsuario", method = RequestMethod.GET )
	public ModelAndView redirigir() {
		return new ModelAndView("modificarUsuario");
	}
}
