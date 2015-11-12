package br.com.locadora.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.locadora.model.Emprestimo;

@Repository("emprestimoDAO")
public class EmprestimoDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public int EmpresimoSave(Emprestimo emprestimo){
		em.persist(emprestimo);
		return emprestimo.getId();
	}
	
	public Emprestimo getEmprestimo (int id){
		
		return em.find(Emprestimo.class, id);
		
	}
	
}
