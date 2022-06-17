package com.sgam.domain;


import java.util.List;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name="USUARIOS")
public class Usuario extends AbstractEntity<Long> {
	
	@Column(name="username", nullable=false, unique= true, length=64)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuario_role", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
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
	
	
	
	
	
}
