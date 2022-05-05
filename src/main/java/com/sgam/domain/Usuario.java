package com.sgam.domain;


import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="USUARIOS")
public class Usuario extends AbstractEntity<Long> {
	
	@Column(name="username", nullable=false, unique= true, length=64)
	private String username;
	
	@Column(name="password", nullable=false, unique= false)
	private String password;
	
	@Column(name="nivel_acesso", nullable=false, unique= false, length=1)
	private int nivel_acesso;
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNivel_acesso() {
		return nivel_acesso;
	}
	public void setNivel_acesso(int nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
	
	
}
