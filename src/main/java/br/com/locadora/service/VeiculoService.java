package br.com.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.locadora.dao.VeiculoDAO;
import br.com.locadora.model.Veiculo;

@Service("veiculoService")
public class VeiculoService {
	
	@Autowired
	@Qualifier("veiculoDAO")
	private VeiculoDAO dao;
	
	public void  veiculoSave(Veiculo veiculo){
		dao.save(veiculo);
	}
	
	public List<Veiculo> getVeiculos(){
		
		return dao.getVeiculos();
	}


}
