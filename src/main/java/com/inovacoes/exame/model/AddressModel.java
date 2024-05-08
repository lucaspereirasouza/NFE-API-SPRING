package com.inovacoes.exame.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50, nullable = false)
	private String street;
	@Column(length = 5, nullable = false)
	private String number;
	@Column(length = 50, nullable = true)
	private String cep;
	
	// acrescent more content pushed by Nota fiscal
	
	
	public AddressModel() {}
	
	public AddressModel(Long id, String street, String number, String cep) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.cep = cep;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, id, number, street);
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
		return Objects.equals(cep, other.cep) && Objects.equals(id, other.id) && Objects.equals(number, other.number)
				&& Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", street=" + street + ", number=" + number + ", cep=" + cep + "]";
	}
	
	// something else
	
	
	
}
