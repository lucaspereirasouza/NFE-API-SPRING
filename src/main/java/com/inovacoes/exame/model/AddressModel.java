package com.inovacoes.exame.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 50, nullable = false)
	private String logradouro;
	@Column(length = 5, nullable = false)
	private String numero;
	@Column(length = 50, nullable = true)
	private String cep;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "ie")
	private String ie;
	
	
	public AddressModel() {}


	public AddressModel(Long id, String logradouro, String numero, String cep, String bairro, String ie) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.ie = ie;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getIe() {
		return ie;
	}


	public void setIe(String ie) {
		this.ie = ie;
	}


	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, id, ie, logradouro, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressModel other = (AddressModel) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep) && Objects.equals(id, other.id)
				&& Objects.equals(ie, other.ie) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(numero, other.numero);
	}


	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep
				+ ", bairro=" + bairro + ", ie=" + ie + "]";
	}
	
	
}
