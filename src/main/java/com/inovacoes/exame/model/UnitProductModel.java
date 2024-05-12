package com.inovacoes.exame.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitproduct")
public class UnitProductModel{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="productid")
	private ProductModel product;
	
	public UnitProductModel() {}
	public UnitProductModel(Long id, ProductModel product) {
		this.id = id;
		this.product = product;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
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
		UnitProductModel other = (UnitProductModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(product, other.product);
	}
	@Override
	public String toString() {
		return "UnitProductModel [id=" + id + ", product=" + product + "]";
	}
	
	
}
