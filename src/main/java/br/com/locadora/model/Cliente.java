package br.com.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String rg;
	private String cpf;
	private String dtNasc;
	private String dtPrimeiracnh;
	private String telefone;
	private String email;
	private String sexo;
	private String numCnh;
	private String estadoEmissor;
	private String validadeCnh;
	
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String rg, String cpf, String dtNasc,
			String dtPrimeiracnh, String telefone, String email, String sexo,
			String numCnh, String estadoEmissor, String validadeCnh) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
		this.dtPrimeiracnh = dtPrimeiracnh;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.numCnh = numCnh;
		this.estadoEmissor = estadoEmissor;
		this.validadeCnh = validadeCnh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getDtPrimeiracnh() {
		return dtPrimeiracnh;
	}
	public void setDtPrimeiracnh(String dtPrimeiracnh) {
		this.dtPrimeiracnh = dtPrimeiracnh;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNumCnh() {
		return numCnh;
	}
	public void setNumCnh(String numCnh) {
		this.numCnh = numCnh;
	}
	public String getEstadoEmissor() {
		return estadoEmissor;
	}
	public void setEstadoEmissor(String estadoEmissor) {
		this.estadoEmissor = estadoEmissor;
	}
	public String getValidadeCnh() {
		return validadeCnh;
	}
	public void setValidadeCnh(String validadeCnh) {
		this.validadeCnh = validadeCnh;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf="
				+ cpf + ", dtNasc=" + dtNasc + ", dtPrimeiracnh="
				+ dtPrimeiracnh + ", telefone=" + telefone + ", email=" + email
				+ ", sexo=" + sexo + ", numCnh=" + numCnh + ", estadoEmissor="
				+ estadoEmissor + ", validadeCnh=" + validadeCnh + "]";
	}
	
	

}
