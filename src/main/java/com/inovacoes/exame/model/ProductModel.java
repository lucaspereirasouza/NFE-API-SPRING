package com.inovacoes.exame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="productName", length = 30,nullable = false)
	private String name;
	@Column(name="productDescription",nullable = false)
	private String description;
	@Column(name="ProductPrice",nullable = false,precision = 2)
	private double price;
	
//	@JoinColumn(name="client")
//	private ClientModel client;

	public ProductModel() {
	}

	public ProductModel(Long id, String name, String description, double price) {
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	
}
