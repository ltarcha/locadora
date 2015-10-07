package br.com.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.locadora.model.Veiculo;
import br.com.locadora.service.VeiculoService;

@Controller
public class VeiculoController {
	
	@Autowired
	@Qualifier("veiculoService")
	private VeiculoService service;
	
	@RequestMapping(value = "/cadastro-veiculo", method = RequestMethod.GET)
	public String home(){
		return "cadastro-veiculo";
	}
	
	@RequestMapping(value = "/saveVeiculo", method = RequestMethod.POST)
	public String save(Veiculo veiculo){
		System.out.println(veiculo);
		service.veiculoSave(veiculo);
		return "cadastro-cliente";
	}

}
