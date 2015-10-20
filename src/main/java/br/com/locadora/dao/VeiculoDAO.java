package br.com.locadora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.locadora.model.Veiculo;

@Repository("veiculoDAO")
public class VeiculoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void save(Veiculo veiculo){
		em.persist(veiculo);
	}
	
	
	public List<Veiculo> getVeiculos(){
		
		List<Veiculo> lista = (List<Veiculo>) em.createQuery("from Veiculo", Veiculo.class).getResultList();
		
		
		return lista;
	}
	
	public Veiculo getVeiculo(int id){
		 
		return em.find(Veiculo.class, id);
		
	}

}
