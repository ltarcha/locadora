package br.com.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue
	private int id;
	private int idCliente;
	private int idVeiculo;
	private String data;
	private String dataDevolucao;
	private String cpf;
	private String localEmp;
	private String localDev;
	private String tarifa;
	private String formaPagamento;
	
	
	public Emprestimo() {

	}

	public Emprestimo(int id, int idCliente, int idVeiculo, String data,
			String dataDevolucao, String cpf, String localEmp, String localDev,
			String tarifa, String formaPagamento) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idVeiculo = idVeiculo;
		this.data = data;
		this.dataDevolucao = dataDevolucao;
		this.cpf = cpf;
		this.localEmp = localEmp;
		this.localDev = localDev;
		this.tarifa = tarifa;
		this.formaPagamento = formaPagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLocalEmp() {
		return localEmp;
	}

	public void setLocalEmp(String localEmp) {
		this.localEmp = localEmp;
	}

	public String getLocalDev() {
		return localDev;
	}

	public void setLocalDev(String localDev) {
		this.localDev = localDev;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", idCliente=" + idCliente
				+ ", idVeiculo=" + idVeiculo + ", data=" + data
				+ ", dataDevolucao=" + dataDevolucao + ", cpf=" + cpf
				+ ", localEmp=" + localEmp + ", localDev=" + localDev
				+ ", tarifa=" + tarifa + ", formaPagamento=" + formaPagamento
				+ "]";
	}
	
	
	

}
