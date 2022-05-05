package com.sgam.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Gestores")

public class Gestor extends AbstractEntity<Long> {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usuario_fk", nullable=false, unique=true)
	private Usuario usuario;
	
	@Column(name= "nome", nullable=false,  length=64)
	private String nome; 
	
	@Column(name= "apelido", nullable=false,length=64)
	private String apelido;
	
	@Column(name= "cidade", nullable=false, length=64)
	private String cidade;
	
	@Column(name= "bairro", nullable=false, length=64)
	private String bairro;
	
	@Column(name= "quarteirao")
	private int quarteirao;
	
	@Column(name= "casa")
	private int casa;
	
	@Column(name= "data_nascimento", columnDefinition = "DATE")
	private String dataNascimento;
	
	@Column(name= "data_inicio", columnDefinition = "DATE")
	private String dataInicio;
	
	@Column(name= "data_Fim", columnDefinition = "DATE")
	private String dataFim;
	
	@Column(name= "telefone", nullable=false, length=9)
	private String telefone;
	
	@Column(name= "telefone_opcional", nullable=true, length=9)
	private String telefone_opcional;
	
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone_opcional() {
		return telefone_opcional;
	}
	public void setTelefone_opcional(String telefone_opcional) {
		this.telefone_opcional = telefone_opcional;
	}

	
	
	@OneToMany(mappedBy ="gestor")
	private List <Estabelecimento> estabelecimentos;
	

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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

	public int getQuarteirao() {
		return quarteirao;
	}

	public void setQuarteirao(int quarteirao) {
		this.quarteirao = quarteirao;
	}

	public int getCasa() {
		return casa;
	}

	public void setCasa(int casa) {
		this.casa = casa;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}
	
	
	
}
