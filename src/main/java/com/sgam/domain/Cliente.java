package com.sgam.domain;


import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="CLIENTES")
public class Cliente extends AbstractEntity<Long> {
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usuario_fk", nullable=false, unique=true)
	private Usuario usuario;
	
	@Column(name= "nome", nullable=false, unique=false, length=64)
	private String nome;
	
	@Column(name= "apelido", nullable=false, unique=false, length=64)
	private String apelido;
	
	@Column(name= "cidade", nullable=false, unique=false, length=64)
	private String cidade;
	
	@Column(name= "bairro", nullable=false, unique=false, length=64)
	private String bairro;
	
	@Column(name= "telefone", nullable=false, length=9)
	private String telefone;
	
	@Column(name= "telefone_opcional", nullable=true, length=9)
	private String telefone_opcional;
	
	
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
	
	

}
