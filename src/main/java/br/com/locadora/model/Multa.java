package br.com.locadora.model;

public class Multa {
	
	private int id;
	private int idEmprestimo;
	private String motivo;
	private double valor;
	
	
	
	public Multa(int idEmprestimo, String motivo, double valor) {
		super();
		this.idEmprestimo = idEmprestimo;
		this.motivo = motivo;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
