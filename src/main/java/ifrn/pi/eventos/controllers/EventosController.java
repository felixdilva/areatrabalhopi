package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return"formEvento";
	}
	
	@RequestMapping(value = "/formrespondido", method = RequestMethod.POST)
	 public String adicionar (String evento) {
	 
		System.out.println("evento: " + evento);
	 
	  
	  return "formSalvo";
	}
}
