package br.com.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.locadora.model.Cliente;
import br.com.locadora.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	private ClienteService service;
	
	@RequestMapping(value = "/saveCliente", method = RequestMethod.POST)
	public String save(Cliente cliente){
		System.out.println(cliente);
		service.clienteSave(cliente);
		return "cadastro-cliente";
	}

}
