package com.inovacoes.exame.model.teste;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@JacksonXmlRootElement(localName = "nfeProc",namespace = "http://www.portalfiscal.inf.br/nfe")
public class Nfeproc {
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

}
