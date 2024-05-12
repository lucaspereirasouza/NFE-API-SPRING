package com.inovacoes.exame.model.NFe;

import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JacksonXmlProperty(localName = "CNPJ")
	@Column(name = "cnpj")
	private String cnpj;

	@JacksonXmlProperty(localName = "xLgr")
	@Column(name = "xlgr")
	private String xlgr;

	@JacksonXmlProperty(localName = "nro")
	@Column(name = "nro")
	private String nro;

	@JacksonXmlProperty(localName = "xBairro")
	@Column(name = "xbairro")
	private String xbairro;

	@JacksonXmlProperty(localName = "cMun")
	@Column(name = "cmun")
	private String cmun;

	@JacksonXmlProperty(localName = "xMun")
	@Column(name = "xmun")
	private String xmun;

	@JacksonXmlProperty(localName = "UF")
	@Column(name = "uf")
	private String uf;

	@JacksonXmlProperty(localName = "CEP")
	@Column(name = "cep")
	private String cep;

	@JacksonXmlProperty(localName = "cPais")
	@Column(name = "cpais")
	private String cPais;

	@JacksonXmlProperty(localName = "xPais")
	@Column(name = "xpais")
	private String xpais;

	@JacksonXmlProperty(localName = "email")
	@Column(name = "email")
	private String email;

	@JacksonXmlProperty(localName = "IE")
	@Column(name = "ie")
	private String ie;

	public Entrega() {}
	public Entrega(Long id, String cnpj, String xlgr, String nro, String cmun, String xmun, String uf, String cep,
		String cPais, String xpais, String email, String ie) {
	this.id = id;
	this.cnpj = cnpj;
	this.xlgr = xlgr;
	this.nro = nro;
	this.cmun = cmun;
	this.xmun = xmun;
	this.uf = uf;
	this.cep = cep;
	this.cPais = cPais;
	this.xpais = xpais;
	this.email = email;
	this.ie = ie;
}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getXlgr() {
		return xlgr;
	}
	public void setXlgr(String xlgr) {
		this.xlgr = xlgr;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	
	public String getXbairro() {
		return xbairro;
	}
	public void setXbairro(String xbairro) {
		this.xbairro = xbairro;
	}
	public String getCmun() {
		return cmun;
	}
	public void setCmun(String cmun) {
		this.cmun = cmun;
	}
	public String getXmun() {
		return xmun;
	}
	public void setXmun(String xmun) {
		this.xmun = xmun;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getcPais() {
		return cPais;
	}
	public void setcPais(String cPais) {
		this.cPais = cPais;
	}
	public String getXpais() {
		return xpais;
	}
	public void setXpais(String xpais) {
		this.xpais = xpais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cPais, cep, cmun, cnpj, email, id, ie, nro, uf, xbairro, xlgr, xmun, xpais);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrega other = (Entrega) obj;
		return Objects.equals(cPais, other.cPais) && Objects.equals(cep, other.cep) && Objects.equals(cmun, other.cmun)
				&& Objects.equals(cnpj, other.cnpj) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(ie, other.ie) && Objects.equals(nro, other.nro)
				&& Objects.equals(uf, other.uf) && Objects.equals(xbairro, other.xbairro)
				&& Objects.equals(xlgr, other.xlgr) && Objects.equals(xmun, other.xmun)
				&& Objects.equals(xpais, other.xpais);
	}
	@Override
	public String toString() {
		return "Entrega [id=" + id + ", cnpj=" + cnpj + ", xlgr=" + xlgr + ", nro=" + nro + ", xbairro=" + xbairro
				+ ", cmun=" + cmun + ", xmun=" + xmun + ", uf=" + uf + ", cep=" + cep + ", cPais=" + cPais + ", xpais="
				+ xpais + ", email=" + email + ", ie=" + ie + "]";
	}
	
}
