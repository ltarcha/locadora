package br.com.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	private int id;
	private String placa;
	private String grupo;
	private String acessorios;
	private String chassi;
	private String cidade;
	private String km;
	private String estado;
	private String modelo;
	private String fabricante;
	private double tarifaLivre;
	private double tarifaControlada;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getTarifaLivre() {
		return tarifaLivre;
	}
	public void setTarifaLivre(double tarifaLivre) {
		this.tarifaLivre = tarifaLivre;
	}
	public double getTarifaControlada() {
		return tarifaControlada;
	}
	public void setTarifaControlada(double tarifaControlada) {
		this.tarifaControlada = tarifaControlada;
	}
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", placa=" + placa + ", grupo=" + grupo
				+ ", acessorios=" + acessorios + ", chassi=" + chassi
				+ ", cidade=" + cidade + ", km=" + km + ", estado=" + estado
				+ ", modelo=" + modelo + ", fabricante=" + fabricante
				+ ", tarifaLivre=" + tarifaLivre + ", tarifaControlada="
				+ tarifaControlada + "]";
	}
	
}
