package br.com.locadora.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.locadora.model.Cliente;

@Repository("clienteDAO")
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void save(Cliente cliente){
		em.persist(cliente);
	}

}
