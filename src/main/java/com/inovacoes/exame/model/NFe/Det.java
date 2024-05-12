package com.inovacoes.exame.model.NFe;



import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Det {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JacksonXmlElementWrapper(localName="prod")
	@JoinColumn(name="prod",nullable=true)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Prod prod;

	public Det(Long id, Prod prod) {
		this.id = id;
		this.prod = prod;
	}

	public Det() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Prod getProd() {
		return prod;
	}

	public void setProd(Prod prod) {
		this.prod = prod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, prod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Det other = (Det) obj;
		return Objects.equals(id, other.id) && Objects.equals(prod, other.prod);
	}

	@Override
	public String toString() {
		return "Det [id=" + id + ", prod=" + prod + "]";
	}
	
	
}
