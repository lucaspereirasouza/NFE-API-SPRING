package com.inovacoes.exame.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchase")
public class PurchaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "clientid")
	private ClientModel client;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "addedproductid")
	private AddedProductModel addedproduct;

	public PurchaseModel() {
	}

	public PurchaseModel(Long id, ClientModel client, AddedProductModel addedproduct) {
		this.id = id;
		this.client = client;
		this.addedproduct = addedproduct;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientModel getClient() {
		return client;
	}

	public void setClient(ClientModel client) {
		this.client = client;
	}

	public AddedProductModel getAddedproduct() {
		return addedproduct;
	}

	public void setAddedproduct(AddedProductModel addedproduct) {
		this.addedproduct = addedproduct;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseModel other = (PurchaseModel) obj;
		return Objects.equals(client, other.client) && Objects.equals(id, other.id)
				&& Objects.equals(addedproduct, other.addedproduct);
	}

	@Override
	public String toString() {
		return "PurchaseModel [id=" + id + ", client=" + client + ", addedproduct=" + addedproduct + "]";
	}

}
