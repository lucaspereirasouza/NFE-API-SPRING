package com.inovacoes.exame.model.NFe;

import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Emit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@JacksonXmlProperty(localName = "xLgr")
	@Column(name = "xLgr")
	private String xLgr;

	@JacksonXmlProperty(localName = "CNPJ")
	@Column(name = "cnpj")
	private String cpnj;
	
	@JacksonXmlProperty(localName = "xNome")
	@Column(name = "xnome")
	private String xnome;
	
	@JacksonXmlProperty(localName = "IE")
	@Column(name = "ie")
	private String ie;
	
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

	@Override
	public int hashCode() {
		return Objects.hash(cpnj, crt, enderemit, id, ie, xLgr, xnome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emit other = (Emit) obj;
		return Objects.equals(cpnj, other.cpnj) && Objects.equals(crt, other.crt)
				&& Objects.equals(enderemit, other.enderemit) && Objects.equals(id, other.id)
				&& Objects.equals(ie, other.ie) && Objects.equals(xLgr, other.xLgr)
				&& Objects.equals(xnome, other.xnome);
	}

	@Override
	public String toString() {
		return "Emit [id=" + id + ", xLgr=" + xLgr + ", cpnj=" + cpnj + ", xnome=" + xnome + ", ie=" + ie + ", crt="
				+ crt + ", enderemit=" + enderemit + "]";
	}

}
