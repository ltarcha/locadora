package br.com.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.locadora.model.Emprestimo;
import br.com.locadora.model.Veiculo;
import br.com.locadora.service.EmprestimoService;
import br.com.locadora.service.VeiculoService;

@Controller
public class EmprestimoController {
	
	@Autowired
	@Qualifier("veiculoService")
	private VeiculoService service;
	
	@Autowired
	@Qualifier("emprestimoService")
	private EmprestimoService emprestimoService;
	
	@RequestMapping(value = "/emprestar", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("emprestar-veiculo");
		//List<Veiculo> lista = service.getVeiculos();
		
		//mv.addObject("lista", lista);
		
		return mv;
	}
	
	@RequestMapping(value = "/emprestar/dados/{idveiculo}", method = RequestMethod.GET)
	public ModelAndView emprestar(@PathVariable("idveiculo") int id){
		ModelAndView mv = new ModelAndView("dados-emprestimo");
		mv.addObject("idveiculo", id);
		
		return mv;
	}
	
	@RequestMapping(value = "/saveEmprestimo", method = RequestMethod.POST)
	public ModelAndView emprestimoSave(Emprestimo emprestimo){
		ModelAndView mv = new ModelAndView("home");
		emprestimoService.emprestimoSave(emprestimo);
		return mv;
	}
			
	
	@RequestMapping(value="/get/veiculos", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Veiculo> getveiculos() {
		return this.service.getVeiculos();
	}

}
