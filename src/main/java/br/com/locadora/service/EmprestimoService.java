package br.com.locadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.locadora.dao.EmprestimoDAO;
import br.com.locadora.model.Emprestimo;

@Service("emprestimoService")
public class EmprestimoService {
	
	@Autowired
	@Qualifier("emprestimoDAO")
	private EmprestimoDAO dao;
	
	public int emprestimoSave(Emprestimo emprestimo){
		return dao.EmpresimoSave(emprestimo);
	}
}
