package com.inovacoes.exame.model.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
public class Enderemit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	<xLgr>LINHA: MONTE BERICO,</xLgr>
	@JacksonXmlProperty(localName = "xLgr")
	@Column(name = "xLgr")
	private String xLgr;
//	<nro>S/N</nro>
	@JacksonXmlProperty(localName = "nro")
	@Column(name = "nro")
	private String nro;
//	<xBairro>INTERIOR</xBairro>
	@JacksonXmlProperty(localName = "xBairro")
	@Column(name = "xbairro")
	private String xBairro;
//	<xMun>VIDEIRA</xMun>
	@JacksonXmlProperty(localName = "xMun")
	@Column(name = "xmun")
	private String xMun;
//	 <UF>SC</UF>
//	@XmlElement(name = "UF")
	@JacksonXmlProperty(localName = "UF")
	@Column(name = "uf")
	private String UF;
//	<CEP>89567899</CEP>
//	@XmlElement(name = "CEP")
	@JacksonXmlProperty(localName = "CEP")
	@Column(name = "cep")
	private String CEP;
//	<xPais>BRASIL</xPais>
	@JacksonXmlProperty(localName = "xPais")
	@Column(name = "xpais")
	private String xPais;
//	<fone>4935313000</fone>
	@JacksonXmlProperty(localName = "fone")
	@Column(name = "fone")
	private String fone;

	public Enderemit() {
	}

	public Enderemit(Long id, String xLgr, String nro, String xBairro, String xMun, String uF, String cEP, String xPais,
			String fone) {
		this.id = id;
		this.xLgr = xLgr;
		this.nro = nro;
		this.xBairro = xBairro;
		this.xMun = xMun;
		UF = uF;
		CEP = cEP;
		this.xPais = xPais;
		this.fone = fone;
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

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getxPais() {
		return xPais;
	}

	public void setxPais(String xPais) {
		this.xPais = xPais;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	

}
