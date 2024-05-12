package com.inovacoes.exame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class ClientModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclient;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "cnpj", length = 11, nullable = true)
	private String CNPJ;
	@Column(name = "cpf", length = 11, nullable = true)
	private String CPF;
	@Column(name = "email")
	private String email;
	
	@OneToMany
	@JoinTable(name = "address")
	private List<AddressModel> address;
	

	public ClientModel() {
	}


	public ClientModel(Long idclient, String name, String cNPJ, String cPF, String email, List<AddressModel> address) {
		this.idclient = idclient;
		this.name = name;
		CNPJ = cNPJ;
		CPF = cPF;
		this.email = email;
		this.address = address;
	}


	public Long getIdclient() {
		return idclient;
	}


	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<AddressModel> getAddress() {
		return address;
	}


	public void setAddress(List<AddressModel> address) {
		this.address = address;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CNPJ, CPF, address, email, idclient, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientModel other = (ClientModel) obj;
		return Objects.equals(CNPJ, other.CNPJ) && Objects.equals(CPF, other.CPF)
				&& Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(idclient, other.idclient) && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "ClientModel [idclient=" + idclient + ", name=" + name + ", CNPJ=" + CNPJ + ", CPF=" + CPF + ", email="
				+ email + ", address=" + address + "]";
	}

}
