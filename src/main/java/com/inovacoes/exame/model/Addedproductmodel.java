package com.inovacoes.exame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "addedproduct")
public class Addedproductmodel implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany
	@JoinColumn(name = "unitproductid",nullable=true)
	private List<Unitproductmodel> unitproduct;

	public Addedproductmodel() {

	}

	public Addedproductmodel(Long id, List<Unitproductmodel> unitproduct) {
		this.id = id;
		this.unitproduct = unitproduct;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Unitproductmodel> getUnitproduct() {
		return unitproduct;
	}

	public void setUnitproduct(List<Unitproductmodel> unitproduct) {
		this.unitproduct = unitproduct;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, unitproduct);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Addedproductmodel other = (Addedproductmodel) obj;
		return Objects.equals(id, other.id) && Objects.equals(unitproduct, other.unitproduct);
	}

	@Override
	public String toString() {
		return "AddedProductModel [id=" + id + ", unitproduct=" + unitproduct + "]";
	}

	
}
