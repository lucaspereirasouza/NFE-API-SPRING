package com.inovacoes.exame.model.NFe;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@JacksonXmlRootElement(localName = "nfeProc",namespace = "http://www.portalfiscal.inf.br/nfe")
public class Nfeproc implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "nfe",nullable = false)
	@JacksonXmlElementWrapper(localName = "NFe",namespace = "http://www.portalfiscal.inf.br/nfe")
	private Nfe nfe;
	
	public Nfeproc() {
	}

	public Nfeproc(Long id, Nfe nfe) {
		this.id = id;
		this.nfe = nfe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Nfe getNfe() {
		return nfe;
	}

	public void setNfe(Nfe nfe) {
		this.nfe = nfe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nfe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nfeproc other = (Nfeproc) obj;
		return Objects.equals(id, other.id) && Objects.equals(nfe, other.nfe);
	}

	@Override
	public String toString() {
		return "Nfeproc [id=" + id + ", nfe=" + nfe + "]";
	}

}
