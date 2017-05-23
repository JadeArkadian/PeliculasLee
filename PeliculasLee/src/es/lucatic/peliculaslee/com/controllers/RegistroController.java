package es.lucatic.peliculaslee.com.controllers;
import javax.validation.Valid;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.service.UsuariosService;

@Controller
public class RegistroController {
	
	// MAPEO usado en el form
	@RequestMapping( value = "/registro", method = RequestMethod.GET )
	
	public ModelAndView interface_altaUsuario() {
		/* LE REDIRECCIONAMOS A LA PAGINA Index.jsp */
		return new ModelAndView( "index", "datosaltausuario", new Usuarios() );
	}
	
	// METODO QUE RECOGE LOS DATOS DEL FORMULARIO
	
	@RequestMapping( value = "/addaltausuario", method = RequestMethod.POST )
	// ANOTACION DE QUE VA A RECIBIR UN Usuario. SIN LA ANOTACION NO FUNCIONA
	public ModelAndView altausuario( @Valid Usuarios usuario,  HttpServletRequest request) {
		System.out.println( usuario.getUsername() );
		
		UsuariosService usuService = new UsuariosService();
		//Si no existe el usuario lo creo, con su respectivo mensaje.
		if( usuService.search(usuario) == null ){
			usuService.add(usuario);
			//Subo a la sesion el usuario registrado
			request.getSession().setAttribute("usuario", usuario);
			request.setAttribute("mensaje", "Bienvenido "+usuario.getUsername());
			
		} else {
			System.out.println( "El usuario ya existe." );
			request.setAttribute("mensaje", "Error al realizar el registro");
		}
		
		return new ModelAndView( "index" );
	}
	
	@ModelAttribute("datosUsuario")  
	//  "datosCoche" coincide con el <form:form method="post" action="registro" commandName="datosUsuario"> del .jsp
	public Usuarios populateForm() {
		 System.out.println("populateForm()");
	     return new Usuarios(); // creamos el bean para que se pueda popular
	}
}
