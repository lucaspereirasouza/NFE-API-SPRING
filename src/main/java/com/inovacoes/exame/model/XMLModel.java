package com.inovacoes.exame.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@JacksonXmlRootElement(localName = "XML")
@Entity
public class XMLModel {
		
	@Id
	@GeneratedValue
	private Long id;	
	// client info
	@Column(name="xnome")
	private String xnome;
	@Column(name="cpf")
	private String cpf;
	
	
	@Column(name="Phone")
	private String fone;
	@Column(name="uf")
	private String uf;
	@Column(name="email")
	private String email;
	// Product info
	
	
	@Column(name="productnae")
	private String xprod;
	@Column(name="cprod") 
	private String cprod;
	@Column(name="qtrib")
	private Long qtrib;
//	private List<String> prod;
//	private ClientModel client;
	
	// addresses
	@Column(name="adress")
	private String address;
	@Column(name="bairro")
	private String xbairo;
	@Column(name="cep")
	private String cep;
	
	@Column(name="counterynum")
	private String cpais;
	@Column(name="countryname")
	private String xpais;
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getXnome() {
		return xnome;
	}




	public void setXnome(String xnome) {
		this.xnome = xnome;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getFone() {
		return fone;
	}




	public void setFone(String fone) {
		this.fone = fone;
	}




	public String getUf() {
		return uf;
	}




	public void setUf(String uf) {
		this.uf = uf;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getXprod() {
		return xprod;
	}




	public void setXprod(String xprod) {
		this.xprod = xprod;
	}




	public String getCprod() {
		return cprod;
	}




	public void setCprod(String cprod) {
		this.cprod = cprod;
	}




	public Long getQtrib() {
		return qtrib;
	}




	public void setQtrib(Long qtrib) {
		this.qtrib = qtrib;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getXbairo() {
		return xbairo;
	}




	public void setXbairo(String xbairo) {
		this.xbairo = xbairo;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getCpais() {
		return cpais;
	}




	public void setCpais(String cpais) {
		this.cpais = cpais;
	}




	public String getXpais() {
		return xpais;
	}




	public void setXpais(String xpais) {
		this.xpais = xpais;
	}




	
	



	public XMLModel() {}
	public XMLModel(Long id, String xnome, String cpf, String fone, String uf, String email, String xprod, String cprod,
			Long qtrib, String address, String xbairo, String cep, String cpais, String xpais) {
		this.id = id;
		this.xnome = xnome;
		this.cpf = cpf;
		this.fone = fone;
		this.uf = uf;
		this.email = email;
		this.xprod = xprod;
		this.cprod = cprod;
		this.qtrib = qtrib;
		this.address = address;
		this.xbairo = xbairo;
		this.cep = cep;
		this.cpais = cpais;
		this.xpais = xpais;
	}
	public XMLModel(String xnome, String cpf, String fone, String uf, String email, String xprod, String cprod,
			Long qtrib, String address, String xbairo, String cep, String cpais, String xpais) {
		this.xnome = xnome;
		this.cpf = cpf;
		this.fone = fone;
		this.uf = uf;
		this.email = email;
		this.xprod = xprod;
		this.cprod = cprod;
		this.qtrib = qtrib;
		this.address = address;
		this.xbairo = xbairo;
		this.cep = cep;
		this.cpais = cpais;
		this.xpais = xpais;
	}
	
	
	// Necessario data to join information
	// product, users
	//
	// XML informations below
	
	
	//Connect client and product
	
	//Data
}
