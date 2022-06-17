package com.sgam.domain;

import javax.persistence.*;




@SuppressWarnings("serial")
@Entity
@Table(name="Madeiras")
public class Madeira extends AbstractEntity<Long> {
	
	@Column(nullable=false, length = 20)
	private String tipo;
	
	@Column(name="comprimento_total", nullable=false)
	private float comprimentoTotal;
	
	@Column(name="comprimento_util", nullable=true)
	private float comprimentoUtil;
	
	@Column(name="largura_total", nullable=false)
	private float larguraTotal;
	
	@Column(name="largura_util", nullable=true)
	private float larguraUtil;
	
	@Column(name="expressura", nullable=false)
	private float expressura;
	
	@Column( nullable=false)
	private String face1_img;
	
	@Column( nullable=false)
	private String face2_img;
	
	@Column( nullable=true)
	private String expressura_img; 
	
	@Column( nullable=false)
	private String unidade;
	
	@ManyToOne()
	@JoinColumn(name="id_usuario_fk")
	private Funcionario funcionario;
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getComprimentoTotal() {
		return comprimentoTotal;
	}

	public void setComprimentoTotal(float comprimentoTotal) {
		this.comprimentoTotal = comprimentoTotal;
	}

	public float getComprimentoUtil() {
		return comprimentoUtil;
	}

	public void setComprimentoUtil(float comprimentoUtil) {
		this.comprimentoUtil = comprimentoUtil;
	}

	public float getLarguraTotal() {
		return larguraTotal;
	}

	public void setLarguraTotal(float larguratotal) {
		this.larguraTotal = larguratotal;
	}

	public float getLarguraUtil() {
		return larguraUtil;
	}

	public void setLarguraUtil(float larguraUtil) {
		this.larguraUtil = larguraUtil;
	}

	public float getExpressura() {
		return expressura;
	}

	public void setExpressura(float expressura) {
		this.expressura = expressura;
	}

	public String getFace1_img() {
		return face1_img;
	}

	public void setFace1_img(String face1_img) {
		this.face1_img = face1_img;
	}

	public String getFace2_img() {
		return face2_img;
	}

	public void setFace2_img(String face2_img) {
		this.face2_img = face2_img;
	}

	public String getExpressura_img() {
		return expressura_img;
	}

	public void setExpressura_img(String expressura_img) {
		this.expressura_img = expressura_img;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
