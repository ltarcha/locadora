package br.com.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Devolucao {
	
	@Id
	@GeneratedValue
	private int id;
	private int idEmprestimo;
	private String data;
	private String local;
	private int km;
	
	
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	@Override
	public String toString() {
		return "Devolucao [id=" + id + ", idEmprestimo=" + idEmprestimo
				+ ", data=" + data + ", local=" + local + ", km=" + km + "]";
	}
	
}
