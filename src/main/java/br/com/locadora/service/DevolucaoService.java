package br.com.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.locadora.dao.DevolucaoDAO;
import br.com.locadora.model.Devolucao;
import br.com.locadora.model.Multa;

@Service("devolucaoService")
public class DevolucaoService {
	
	@Autowired
	@Qualifier("devolucaoDAO")
	private DevolucaoDAO dao;
	
	@Autowired
	@Qualifier("calculaMultaService")
	private CalculaMultaService calcMultas;
	
	public List<Multa> insert(Devolucao devolucao){
		
		this.dao.insertDevolucao(devolucao);
		return calcMultas.calculaMulta(devolucao);
		
	}

}
