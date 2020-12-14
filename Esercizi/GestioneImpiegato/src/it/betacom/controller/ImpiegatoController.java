package it.betacom.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import it.betacom.architetture.dao.ImpiegatoDAO;
import it.betacom.businnessmodel.model.Impiegato;

@Controller
public class ImpiegatoController {
	@Autowired
	ImpiegatoDAO dao;
	
	@RequestMapping("/impform")
	public String visualizzaForm(Model m) { //comand fa rifermimento al submit della form
		m.addAttribute("impiegato", new Impiegato());
		return "paginaform";
		//la pagina di restituzione di impform è pagina form, l operazione che deve essere eseguita al submit
		//è generare un istanza del impiegato
	}
	
	@RequestMapping( value = "/salva", method = RequestMethod.POST)
	public ModelAndView createImpiegato(@RequestParam("file") MultipartFile file, @Valid @ModelAttribute("impiegato")
	Impiegato impiegato, BindingResult br) throws IOException {
		if(br.hasErrors()) {
			return new ModelAndView("paginaform", "command", impiegato);
		}else {
			String fileName = "betacom.png";
			if (!file.isEmpty()) {
				 BufferedImage src = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
				 fileName = file.getOriginalFilename();
				 File destination = new File("C:/Users/betacom/eclipse-workspace2/GestioneImpiegato/WebContent/resources/img/" + fileName);
				 ImageIO.write(src, "png", destination);
				 }
			impiegato.setUrl_img(fileName);
			dao.create(impiegato);
			return new ModelAndView("forward:/impreport");
		}
	}
	
	//questa view avra un oggetto lista che contiene la lista
	@RequestMapping("/impreport")
	public ModelAndView visualizzaImpiegato() {
		List<Impiegato> lista = dao.getImpiegati();
		return new ModelAndView("paginareport","lista",lista);
	}
	
	@RequestMapping("/statistiche")
	public ModelAndView visualizzaStatisticheImpiegato(Model m) {
		List<Impiegato> lista1 = dao.getAvgStipRep();
		List<Impiegato> lista2 = dao.getRepMaxStip();
		m.addAttribute("stipendioMax", dao.getImpStipMax());
		m.addAttribute("lista1", lista1);
		m.addAttribute("lista2", lista2);
		return new ModelAndView("paginastatistiche");
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
	
}


