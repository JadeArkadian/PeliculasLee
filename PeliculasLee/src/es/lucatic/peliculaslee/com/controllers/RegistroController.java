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
import es.lucatic.peliculaslee.com.utils.ValidatorUsuario;

@Controller
public class RegistroController {

	// MAPEO usado en el form
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView interface_altaUsuario() 
	{
		System.out.println("ENTRAinterface_altaUsuario");

		/* LE REDIRECCIONAMOS A LA PAGINA Index.jsp */
		return new ModelAndView("register", "datosaltausuario", new Usuarios());
	}

	// METODO QUE RECOGE LOS DATOS DEL FORMULARIO

	@RequestMapping(value = "/addaltausuario", method = RequestMethod.POST)
	// ANOTACION DE QUE VA A RECIBIR UN Usuario. SIN LA ANOTACION NO FUNCIONA
	public ModelAndView altausuario(@Valid Usuarios usuario, HttpServletRequest request) 
	{
		String mensaje = "";
		boolean todoValido = true;
		String inicio = "../index";
		String registro = "register";
		ModelAndView modelandviewAux = null;
		
		if (ValidatorUsuario.hayCamposVacios(usuario.getUsername(), usuario.getNombre(), usuario.getApellidos(),
				usuario.getPassword(), usuario.getPasswordconfirm(), usuario.getEmail())) 
		{
			mensaje = "Error,rellene todos los campos.";
			request.setAttribute("mensaje", mensaje);
			todoValido = false;
			modelandviewAux = new ModelAndView(registro);
		} 
		else 
		{
			if (!ValidatorUsuario.esUsernameValido(usuario.getUsername())) 
			{
				mensaje = "Error, el username tiene que tener minimo 5 caracteres.";
				request.setAttribute("mensaje", mensaje);
				todoValido = false;
				modelandviewAux = new ModelAndView(registro);
			} 
			else 
			{
				if (!ValidatorUsuario.esNombreValido(usuario.getNombre())) 
				{
					mensaje = "Error, el nombre no puede contener numeros o digitos.";
					request.setAttribute("mensaje", mensaje);
					todoValido = false;
					modelandviewAux = new ModelAndView(registro);
				} 
				else 
				{
					if (!ValidatorUsuario.esPasswordValida(usuario.getPassword())) 
					{
						mensaje = "Error, la contrase�a debe contener al menos 1 numero, 1 mayuscula, 1 minuscula.";
						request.setAttribute("mensaje", mensaje);
						todoValido = false;
						modelandviewAux = new ModelAndView(registro);
					} 
					else 
					{
						if (!ValidatorUsuario.coincidenLasPasswords(usuario.getPassword(),
								usuario.getPasswordconfirm())) 
						{
							mensaje = "Error, las contrase�as deben coincidir.";
							request.setAttribute("mensaje", mensaje);
							todoValido = false;
							modelandviewAux = new ModelAndView(registro);
						} 
						else 
						{
							if (!ValidatorUsuario.esValidoMail(usuario.getEmail())) 
							{
								mensaje = "Error, en el formato del correo.";
								request.setAttribute("mensaje", mensaje);
								todoValido = false;
								modelandviewAux = new ModelAndView(registro);
							}
						}
					}
				}
			}
			
			if (todoValido) 
			{
				UsuariosService usuService = new UsuariosService();
				// Si no existe el usuario lo creo, con su respectivo mensaje.
				if (usuService.findUsuariosByUsername(usuario) == null) 
				{
					usuService.insertUsuario(usuario);
					// Subo a la sesion el usuario registrado
					request.getSession().setAttribute("usuario", usuario);
					mensaje = "Bienvenido " + usuario.getUsername();
					request.setAttribute("mensaje", mensaje);
					System.out.println("altausuario");
					modelandviewAux = new ModelAndView(inicio);

				} 
				else 
				{
					System.out.println("El usuario ya existe.");
					mensaje = "Error al realizar el registro";
					request.setAttribute("mensaje", mensaje);
					modelandviewAux = new ModelAndView(registro);
				}
			}
		}

		System.out.println(mensaje);
		modelandviewAux.addObject(mensaje);
		modelandviewAux.addObject(request);
		return modelandviewAux;

	}

	@ModelAttribute("datosUsuario")
	// "datosCoche" coincide con el <form:form method="post" action="registro"
	// commandName="datosUsuario"> del .jsp
	public Usuarios populateForm() {

		System.out.println("populateForm()");
		return new Usuarios(); // creamos el bean para que se pueda popular
	}
}
