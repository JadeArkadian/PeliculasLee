package es.lucatic.peliculaslee.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.lucatic.peliculaslee.com.domains.Usuarios;
import es.lucatic.peliculaslee.com.service.UsuariosService;

@Controller
public class ModificarUsuarioController {
	
	@RequestMapping( value = "/modificar", method = RequestMethod.POST )
	
	public ModelAndView interface_modificarUsuario(HttpServletRequest request) 
	{
		/* LE REDIRECCIONAMOS A LA PAGINA Index.jsp */
		//Obtengo el usuario de la session actual.
		Usuarios usuario= (Usuarios) request.getSession().getAttribute("usuario");
		String password = request.getParameter("password");
		String passwordConfirm = request.getParameter("passwordConfirm");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		//Errores
		String mensajePass = "Las contrase�as deben de coincidir";
		String mensajeNombre = "El campo nombre no puede estar vacio";
		String mensajeApellido ="El campo apellido no puede estar vacio";
		
		//Compruebo que las contrase�as coincidan, el nombre y el apellido no esten vacios.
		if(password.equals(passwordConfirm))
		{
			if(!nombre.isEmpty())
			{
				if(!apellidos.isEmpty())
				{
					usuario.setApellidos(apellidos);
					usuario.setNombre(nombre);
					usuario.setPassword(password);
					UsuariosService usuService = new UsuariosService();
					usuService.updateUsuario(usuario);
					
					//Subo el nuevo usuario a la nuve y le redirigo a su pagina de perfil
					request.getSession().setAttribute("usuario", usuario);
					
				}
				else
				{
					request.setAttribute("mensaje", mensajeApellido);
				}
			} else{
				request.setAttribute("mensaje", mensajeNombre);
			}
					
		}
		else 
		{
			request.setAttribute("mensaje", mensajePass);
		}
		
		
		return new ModelAndView( "perfil");
	}
	
}
