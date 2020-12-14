package it.betacom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.betacom.businnesscomponent.utilities.CheckLogin;
import it.betacom.businnessmodel.model.Utente;

@Controller
public class LoginController {
	@Autowired
	CheckLogin cl;
	
	@RequestMapping("/loginform")
	public ModelAndView visualizzaFormLogin() {
		return new ModelAndView("paginalogin","command", new Utente());
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute("utente") Utente utente, HttpServletRequest request) {
		String userpass = cl.getUserPass(utente.getUsername());
		HttpSession session = request.getSession();
		if(userpass != null) {
			if(userpass.equals(utente.getPassword())){
				session.setAttribute("username", utente.getUsername());
			return new ModelAndView("forward:/impreport"); 
			}else {
				return new ModelAndView("paginalogin","command", new Utente());
			}
		}
		return null;
	}
	
	@RequestMapping("/logoutrequest")
	public ModelAndView logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return new ModelAndView("redirect:/logout.jsp");
	}
}
