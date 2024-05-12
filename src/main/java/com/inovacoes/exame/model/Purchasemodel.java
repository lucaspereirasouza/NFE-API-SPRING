package com.inovacoes.exame.model;

import java.io.Serializable;
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
public class Purchasemodel  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "clientid")
	private Clientmodel client;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "addedproductid")
	private Addedproductmodel addedproduct;

	public Purchasemodel() {
	}

	public Purchasemodel(Long id, Clientmodel client, Addedproductmodel addedproduct) {
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

	public Clientmodel getClient() {
		return client;
	}

	public void setClient(Clientmodel client) {
		this.client = client;
	}

	public Addedproductmodel getAddedproduct() {
		return addedproduct;
	}

	public void setAddedproduct(Addedproductmodel addedproduct) {
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
		Purchasemodel other = (Purchasemodel) obj;
		return Objects.equals(client, other.client) && Objects.equals(id, other.id)
				&& Objects.equals(addedproduct, other.addedproduct);
	}

	@Override
	public String toString() {
		return "PurchaseModel [id=" + id + ", client=" + client + ", addedproduct=" + addedproduct + "]";
	}

}
