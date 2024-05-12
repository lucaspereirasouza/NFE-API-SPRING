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
@Table(name = "unitproduct")
public class Unitproductmodel implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="productid")
	private Productmodel product;
	
	public Unitproductmodel() {}
	public Unitproductmodel(Long id, Productmodel product) {
		this.id = id;
		this.product = product;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Productmodel getProduct() {
		return product;
	}
	public void setProduct(Productmodel product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unitproductmodel other = (Unitproductmodel) obj;
		return Objects.equals(id, other.id) && Objects.equals(product, other.product);
	}
	@Override
	public String toString() {
		return "UnitProductModel [id=" + id + ", product=" + product + "]";
	}
	
	
}
