package com.inovacoes.exame.model.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
public class Nfe {
	
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
	
	
}
