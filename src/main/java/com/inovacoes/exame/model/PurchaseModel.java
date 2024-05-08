package com.inovacoes.exame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class PurchaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//quantity,barcode     -- barcode scanner implementation
	
//	//client, product
//	@JoinColumn(name = "idClient")
//	private ClientModel client;
//	
//	//not sure
//	@JoinColumn(name = "idProduct")
//	private ProductModel product;
	
}
