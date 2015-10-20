package br.com.locadora.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.locadora.model.Devolucao;

@Repository("devolucaoDAO")
public class DevolucaoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void insertDevolucao(Devolucao devolucao){
		em.persist(devolucao);
	}
	
}
