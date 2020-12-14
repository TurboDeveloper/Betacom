package it.betacom.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.betacom.architetture.dao.UtenteDAO;
import it.betacom.businnessmodel.model.Utente;

@Controller
public class UtenteController {
	@Autowired
	UtenteDAO utenteDao;
	
	@RequestMapping("/registraUtenteform")
	public ModelAndView visualizzaForm() { //comand fa rifermimento al submit della form
		return new ModelAndView("paginaRegistraUtente", "command", new Utente());
		//la pagina di restituzione di impform è pagina form, l operazione che deve essere eseguita al submit
		//è generare un istanza del impiegato
	}
	
	@RequestMapping( value = "/salvaUtente", method = RequestMethod.POST)
	public ModelAndView createImpiegato(@ModelAttribute("utente") Utente utente, HttpServletRequest request) {
		utenteDao.create(utente);
		HttpSession session = request.getSession();
		session.setAttribute("username", utente.getUsername());
		return new ModelAndView("forward:/impreport");
	}
	/*
	//questa view avra un oggetto lista che contiene la lista
	@RequestMapping("/impreport")
	public ModelAndView visualizzaImpiegato() {
		List<Impiegato> lista = dao.getImpiegati();
		return new ModelAndView("paginareport","lista",lista);
	}
	
	@RequestMapping("/cancella/{id}")
	public ModelAndView cancellaImpiegato(@PathVariable long id) {
		dao.delete(id);
		return new ModelAndView("redirect:/impreport");
	}
	
	@RequestMapping("/modificatemp/{id}")
	public ModelAndView modificaImpiegatoTemp(@PathVariable long id) {
		Impiegato imp = dao.getById(id);
		return new ModelAndView("paginamodifica", "command", imp);
	}
	
	@RequestMapping(value = "/modifica", method = RequestMethod.POST)
	public ModelAndView modificaImpiegato(@ModelAttribute("imp") Impiegato imp) {
		dao.update(imp);
		return new ModelAndView("redirect:/impreport");
	}
	*/
}


