package com.sgam.domain;



import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name="Funcionarios")
public class Funcionario extends AbstractEntity<Long> {
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usuario_fk" ,nullable=false, unique=true)
	private Usuario usuario;
	
	@Column(name= "nome", nullable=false)
	private String nome; 
	
	

	@Column(name= "apelido", nullable=false)
	private String apelido;
	
	@Column(name= "cidade", nullable=false)
	private String cidade;
	
	@Column(name= "bairro", nullable=false)
	private String bairro;
	
	@Column(name= "quarteirao")
	private int quarteirao;
	
	@Column(name= "casa")
	private int casa;
	
	@Column(name= "sexo")
	private String sexo;
	
	@Column(name= "bilhete_identidade")
	private String bi;
	
	@DateTimeFormat(iso= ISO.DATE)
	@Column(name= "data_nascimento", columnDefinition = "DATE")
	private String dataNascimento;
	
	@DateTimeFormat(iso= ISO.DATE)
	@Column(name= "data_inicio", columnDefinition = "DATE")
	private String dataInicio;
	
	@DateTimeFormat(iso= ISO.DATE)
	@Column(name= "data_Fim", columnDefinition = "DATE")
	private String dataFim;
	
	@Column(name= "telefone")
	private String telefone;
	
	@Column(name= "telefone_opcional")
	private String telefone_opcional;
	
	@ManyToOne()
	@JoinColumn(name="id_estabelecimento_fk")
	private Estabelecimento estabelecimento;
	
	@OneToMany(mappedBy="funcionario", cascade = CascadeType.ALL)
	private List<Madeira> madeiras;
	
	public String getBi() {
		return bi;
	}
	public void setBi(String bi) {
		this.bi = bi;
	}
		
	
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
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public List<Madeira> getMadeiras() {
		return madeiras;
	}
	public void setMadeiras(List<Madeira> madeiras) {
		this.madeiras = madeiras;
	}
	
	
	
}
