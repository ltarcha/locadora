package br.com.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.locadora.model.Devolucao;
import br.com.locadora.model.Multa;
import br.com.locadora.service.DevolucaoService;

@Controller
public class DevolucaoController {

	@Autowired
	@Qualifier("devolucaoService")
	private DevolucaoService devolucaoServer;
	
	@RequestMapping(value = "/saveDevolucao", method = RequestMethod.POST)
	public ModelAndView devolucaoSave(Devolucao devolucao){
		ModelAndView mv = new ModelAndView("devolver-veiculo");
		List<Multa> lista = devolucaoServer.insert(devolucao);
		mv.addObject("lista",lista);
		return mv;
	}
	@RequestMapping(value = "/devolucao", method = RequestMethod.GET)
	public ModelAndView devolucao(){
		ModelAndView mv = new ModelAndView("devolver-veiculo");
		
		return mv;
	}
}
