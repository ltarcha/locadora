package br.com.locadora.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.locadora.dao.EmprestimoDAO;
import br.com.locadora.dao.VeiculoDAO;
import br.com.locadora.model.Devolucao;
import br.com.locadora.model.Emprestimo;
import br.com.locadora.model.Multa;
import br.com.locadora.model.TarifaType;
import br.com.locadora.model.Veiculo;

@Service("calculaMultaService")
public class CalculaMultaService {
	
	@Autowired
	@Qualifier("veiculoDAO")
	private VeiculoDAO daoVeiculo;
	
	@Autowired
	@Qualifier("emprestimoDAO")
	private EmprestimoDAO daoEmp;
	
	
	public List<Multa> calculaMulta(Devolucao dev){
		
		Emprestimo emp = daoEmp.getEmprestimo(dev.getIdEmprestimo());
		
		List<Multa> lista = new ArrayList<Multa>();
		
		Multa multaPorKm = calculaKmControlado(emp, dev);
		
		if(multaPorKm != null){
			lista.add(multaPorKm);
		}
		
		return lista;
	}
	
	public Multa calculaKmControlado(Emprestimo emp, Devolucao dev){
		
		int kmControlado;
		int kmVeiculo;
		double preco;
		
		TarifaType.values();
		
		if (emp.getTarifa() != TarifaType.Livre){
			
			Veiculo veiculo = daoVeiculo.getVeiculo(emp.getIdVeiculo());
			
			kmVeiculo = veiculo.getKm();
			
			kmControlado = dev.getKm() - kmVeiculo;
			
			double precoPorKm = daoVeiculo.getVeiculo(emp.getIdVeiculo()).getTarifaControlada();
			
			preco = kmControlado * precoPorKm;
			
			Multa multa = new Multa(emp.getId(), "Adicional por KM", preco);
			
			return multa;
			
		}
		
		return null;
	}
}
