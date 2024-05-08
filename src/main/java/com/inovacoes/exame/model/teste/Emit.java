package com.inovacoes.exame.model.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
public class Emit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// client info

//		<xLgr>LINHA: MONTE BERICO,</xLgr>
	@JacksonXmlProperty(localName = "xLgr")
	@Column(name = "xLgr")
	private String xLgr;
//		<CNPJ>02011086000183</CNPJ>
	@JacksonXmlProperty(localName = "CNPJ")
	@Column(name = "cnpj")
	private String cpnj;
//		<xNome>MASTER AGROINDUSTRIAL S/A</xNome>
	@JacksonXmlProperty(localName = "xNome")
	@Column(name = "xnome")
	private String xnome;
//		<IE>253459435</IE>
	@JacksonXmlProperty(localName = "IE")
	@Column(name = "ie")
	private String ie;
//		<CRT>3</CRT>
	@JacksonXmlProperty(localName = "CRT")
	@Column(name = "crt")
	private String crt;

	@JacksonXmlElementWrapper(localName = "enderEmit")
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "enderemit",nullable = false)
	private Enderemit enderemit;

	public Emit() {
	}

	public Emit(Long id, String xLgr, String cpnj, String xnome, String ie, String crt, Enderemit enderemit) {
		this.id = id;
		this.xLgr = xLgr;
		this.cpnj = cpnj;
		this.xnome = xnome;
		this.ie = ie;
		this.crt = crt;
		this.enderemit = enderemit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public String getXnome() {
		return xnome;
	}

	public void setXnome(String xnome) {
		this.xnome = xnome;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCrt() {
		return crt;
	}

	public void setCrt(String crt) {
		this.crt = crt;
	}

	public Enderemit getEnderemit() {
		return enderemit;
	}

	public void setEnderemit(Enderemit enderemit) {
		this.enderemit = enderemit;
	}

}
