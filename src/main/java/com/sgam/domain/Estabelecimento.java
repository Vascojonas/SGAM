package com.sgam.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Estabelecimentos")
public class Estabelecimento extends AbstractEntity<Long> {

	@Column(name= "nome", nullable=true, length=64)
	private String nome;
	
	@Column(name= "provincia", nullable=false, length=64)
	private String provincia;
	
	@Column(name= "cidade", nullable=false, length=64)
	private String cidade;
	
	@Column(name= "bairro", nullable=false, length=64)
	private String bairro;
	
	@Column(name= "avenida", nullable=false)
	private int avenida;
	
	@ManyToOne()
	@JoinColumn(name="id_gestor_fk")
	private Gestor gestor;
	
	@OneToMany(mappedBy="estabelecimento")
	private List <Funcionario> funcionarios;

	public String getProvincia() {
		return provincia;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getAvenida() {
		return avenida;
	}

	public void setAvenida(int avenida) {
		this.avenida = avenida;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
}
