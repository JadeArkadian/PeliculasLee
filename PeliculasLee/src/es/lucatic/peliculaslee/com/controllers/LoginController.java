package es.lucatic.peliculaslee.com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.interfaces.services.IUsuariosService;
import es.lucatic.peliculaslee.com.service.UsuariosService;

//ESTE CONTROLLER COMPRUEBA SI EL USUARIO Y AL CONTRASEÑA SON CORRECTAS 
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// ANOTACION DE QUE VA A RECIBIR UN PRODUCTO. SIN LA ANOTACION NO FUNCIONA
	public ModelAndView altaUsuario(@Valid Usuarios usuario, HttpServletRequest request) {
		String pagina = "index";

		HttpServletResponse response;
		String mensaje = "";
		HttpSession session = request.getSession(true);

		IUsuariosService usuarioService = new UsuariosService();
		Usuarios aux = usuarioService.search(usuario);
		if (aux.getUsername().equals(usuario.getUsername())) {
			if (aux.getPassword().equals(usuario.getPassword())) {
				// Si el usuario está en la base de datos subimos a la nube su
				// informacion
				session.setAttribute("usuario", usuario);

			}
		} else {
			mensaje = "El usuario o la contraseña no son correctas.";
			request.setAttribute("mensaje", mensaje);
			pagina = "registrar";

		}

		return new ModelAndView(pagina);

	}
	@ModelAttribute("datoslogin")  //para el tema de validaciones hay que poner esto ademas
	 //  "datosCoche" coincide con el <form:form method="post" action="login.do" commandName="datoslogin"> del .jsp
	public Usuarios populateForm() {
		 System.out.println("populateForm usuarioLogin()");
	     return new Usuarios(); // creamos el bean para que se pueda popular
	}

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

}
