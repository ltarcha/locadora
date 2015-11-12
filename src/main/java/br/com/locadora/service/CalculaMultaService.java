package br.com.locadora.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
		
		Multa multaCidade = calculaCidadeDiferente(emp, dev);
		
		Multa multaAtraso = calculaDiasAtrasados(emp, dev);
		
		if(multaPorKm != null){
			lista.add(multaPorKm);
		}
		
		if(multaCidade != null){
			lista.add(multaCidade);
		}
		
		if(multaAtraso != null){
			
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
	
	public Multa calculaCidadeDiferente(Emprestimo emp, Devolucao dev){
		
		double preco;
		if(!emp.getLocalDev().equals(dev.getLocal())){
			preco = calculaKmCidades(emp.getLocalDev(), dev.getLocal());
			Multa multa = new Multa(emp.getId(), "Devolução em cidade não planejada no emprestimo", preco);
			return multa;
		}
		
		return null;
	}
	
	public Multa calculaDiasAtrasados(Emprestimo emp, Devolucao dev){
		
		String totalDias;
		if(emp.getDataDevolucao() != dev.getData()){
			
			System.out.println("Dia emp: " + dev.getData().substring(0, 2));
			System.out.println("Mes emp: " + dev.getData().substring(2, 4));
			System.out.println("Ano emp: " + dev.getData().substring(4, 8));
			System.out.println("data emp: " + dev.getData());
			
		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
		      
		    Calendar dts = Calendar.getInstance();  
		    dts.set(Integer.parseInt(dev.getData().substring(4, 8)), Integer.parseInt(dev.getData().substring(2, 4)), Integer.parseInt(dev.getData().substring(0, 2)));//data retirada - maior  
		      
		    Calendar dte = Calendar.getInstance();  
		    dte.set(Integer.parseInt(emp.getDataDevolucao().substring(4, 8)), Integer.parseInt(emp.getDataDevolucao().substring(2, 4)), Integer.parseInt(emp.getDataDevolucao().substring(0, 2)));// data locação  - menor  
		      
		    dts.add(Calendar.DATE, - dte.get(Calendar.DAY_OF_MONTH));  
		    
		   // totaldiarias.setText(sdf.format(dts.get(Calendar.DAY_OF_MONTH)));  
		    totalDias = (sdf.format(dts.get(Calendar.DAY_OF_MONTH)));  
			
		    System.out.println(totalDias +  " teste");
			
		}
		
		return null;
	}
	
	public double calculaKmCidades(String cidade, String cidade2){
		/*Chumbei 100 KM**/
		return 100;
	}
	
}
