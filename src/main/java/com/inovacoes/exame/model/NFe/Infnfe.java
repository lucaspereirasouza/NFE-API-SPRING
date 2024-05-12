package com.inovacoes.exame.model.NFe;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Infnfe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JacksonXmlElementWrapper(localName = "emit")
	@JoinColumn(name="emit",nullable = false)
	@OneToOne(cascade=CascadeType.PERSIST)
	private Emit emit;
	
	@JacksonXmlElementWrapper(localName = "dest")
	@JoinColumn(name="dest",nullable = false)
	@OneToOne(cascade=CascadeType.PERSIST)
	private Dest dest;

	@JacksonXmlElementWrapper(localName = "entrega")
	@JoinColumn(name="entrega",nullable = false)
	@OneToOne(cascade=CascadeType.PERSIST)
	private Entrega entrega;
	
	@JacksonXmlElementWrapper(useWrapping = false)
	@JoinColumn(name="det",nullable=true)
	@OneToMany(cascade = CascadeType.PERSIST)
	@JacksonXmlProperty(localName = "det")
	private List<Det> det;
	
	public Infnfe() {
	}

	
	public Infnfe(Long id, Emit emit, Dest dest, Entrega entrega, List<Det> det) {
		this.id = id;
		this.emit = emit;
		this.dest = dest;
		this.entrega = entrega;
		this.det = det;
	}

	public List<Det> getDet() {
		return det;
	}


	public void setDet(List<Det> det) {
		this.det = det;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Emit getEmit() {
		return emit;
	}

	public void setEmit(Emit emit) {
		this.emit = emit;
	}

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dest, det, emit, entrega, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infnfe other = (Infnfe) obj;
		return Objects.equals(dest, other.dest) && Objects.equals(det, other.det) && Objects.equals(emit, other.emit)
				&& Objects.equals(entrega, other.entrega) && Objects.equals(id, other.id);
	}
	
}
