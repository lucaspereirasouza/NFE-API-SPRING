package com.inovacoes.exame.model.NFe;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Nfe implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JacksonXmlElementWrapper(localName = "infNFe")
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "infnfe",nullable = false)
	private Infnfe infnfe;

	public Nfe() {}
	
	public Nfe(Long id, Infnfe infnfe) {
		this.id = id;
		this.infnfe = infnfe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Infnfe getInfnfe() {
		return infnfe;
	}

	public void setInfnfe(Infnfe infnfe) {
		this.infnfe = infnfe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, infnfe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nfe other = (Nfe) obj;
		return Objects.equals(id, other.id) && Objects.equals(infnfe, other.infnfe);
	}

	@Override
	public String toString() {
		return "Nfe [id=" + id + ", infnfe=" + infnfe + "]";
	}
}
