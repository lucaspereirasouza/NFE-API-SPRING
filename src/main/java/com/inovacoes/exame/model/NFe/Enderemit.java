package com.inovacoes.exame.model.NFe;

import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enderemit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@JacksonXmlProperty(localName = "xLgr")
	@Column(name = "xLgr")
	private String xLgr;

	@JacksonXmlProperty(localName = "nro")
	@Column(name = "nro")
	private String nro;

	@JacksonXmlProperty(localName = "xBairro")
	@Column(name = "xbairro")
	private String xBairro;

	@JacksonXmlProperty(localName = "xMun")
	@Column(name = "xmun")
	private String xMun;

	@JacksonXmlProperty(localName = "UF")
	@Column(name = "uf")
	private String UF;

	@JacksonXmlProperty(localName = "CEP")
	@Column(name = "cep")
	private String CEP;

	@JacksonXmlProperty(localName = "xPais")
	@Column(name = "xpais")
	private String xPais;

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

	@Override
	public int hashCode() {
		return Objects.hash(CEP, UF, fone, id, nro, xBairro, xLgr, xMun, xPais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enderemit other = (Enderemit) obj;
		return Objects.equals(CEP, other.CEP) && Objects.equals(UF, other.UF) && Objects.equals(fone, other.fone)
				&& Objects.equals(id, other.id) && Objects.equals(nro, other.nro)
				&& Objects.equals(xBairro, other.xBairro) && Objects.equals(xLgr, other.xLgr)
				&& Objects.equals(xMun, other.xMun) && Objects.equals(xPais, other.xPais);
	}

	@Override
	public String toString() {
		return "Enderemit [id=" + id + ", xLgr=" + xLgr + ", nro=" + nro + ", xBairro=" + xBairro + ", xMun=" + xMun
				+ ", UF=" + UF + ", CEP=" + CEP + ", xPais=" + xPais + ", fone=" + fone + "]";
	}
}
