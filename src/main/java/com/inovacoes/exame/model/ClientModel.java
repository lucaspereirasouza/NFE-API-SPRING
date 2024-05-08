package com.inovacoes.exame.model;

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
public class ClientModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idclient;
	// nome, endereço e outras informações relevantes.
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "cpf", length = 11, nullable = false)
	private String CPF;

	@OneToMany
	@JoinTable(name = "address")
	private List<AddressModel> address;
	
	/*
	 * @OneToMany
	 * 
	 * @JoinTable(name = "address") private List<AddressModel> address;
	 */

	public ClientModel() {
	}

	public ClientModel(Long idclient, String name, String cPF, List<AddressModel> address) {
		this.idclient = idclient;
		this.name = name;
		CPF = cPF;
		this.address = address;
	}

	public List<AddressModel> getAddress() {
		return address;
	}

	public void setAddress(List<AddressModel> address) {
		this.address = address;
	}

	public ClientModel(Long idclient, String name, String cPF) {
		this.idclient = idclient;
		this.name = name;
		CPF = cPF;
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, idclient, name);
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
		return Objects.equals(CPF, other.CPF) && Objects.equals(idclient, other.idclient)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "ClientModel [idclient=" + idclient + ", name=" + name + ", CPF=" + CPF + "]";
	} 
}
