package com.sgam.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Estabelecimentos")
public class Estabelecimento extends AbstractEntity<Long> {

	@Column(name= "nome")
	private String nome;
	
	@Column(name= "provincia")
	private String provincia;
	
	@Column(name= "cidade")
	private String cidade;
	
	@Column(name= "bairro")
	private String bairro;
	
	@Column(name= "avenida")
	private String avenida;
	
	@ManyToOne()
	@JoinColumn(name="id_gestor_fk")
	private Gestor gestor;
	
	@OneToMany(mappedBy="estabelecimento",  cascade = CascadeType.ALL)
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



	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
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
