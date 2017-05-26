package es.lucatic.peliculaslee.com.controllers;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LogoutController {

	public LogoutController() 
	{
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout( HttpServletRequest request) 
	{
		String pagina = "../index";

		HttpSession session = request.getSession(true);
		session.invalidate();
		return new ModelAndView(pagina);
	}

}
