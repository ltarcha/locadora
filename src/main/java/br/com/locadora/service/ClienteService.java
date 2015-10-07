package br.com.locadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.locadora.dao.ClienteDAO;
import br.com.locadora.model.Cliente;

@Service("clienteService")
public class ClienteService {
	
	@Autowired
	@Qualifier("clienteDAO")
	private ClienteDAO dao;
	
	public void  clienteSave(Cliente cliente){
		dao.save(cliente);
	}

}
