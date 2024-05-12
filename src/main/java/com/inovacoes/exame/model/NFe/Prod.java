package com.inovacoes.exame.model.NFe;

import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prod {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@JacksonXmlProperty(localName = "cProd")
	@Column(name = "cprod")
	private String cprod;

	@JacksonXmlProperty(localName = "cEAN")
	@Column(name = "cean")
	private String cean;

	@JacksonXmlProperty(localName = "xProd")
	@Column(name = "xprod")
	private String xprod;

	@JacksonXmlProperty(localName = "NCM")
	@Column(name = "ncm")
	private String ncm;

	@JacksonXmlProperty(localName = "CEST")
	@Column(name = "cest")
	private String cest;

	@JacksonXmlProperty(localName = "indEscala")
	@Column(name = "indescala")
	private String indescala;

	@JacksonXmlProperty(localName = "CFOP")
	@Column(name = "cfop")
	private String cfop;

	@JacksonXmlProperty(localName = "KG")
	@Column(name = "kg")
	private String kg;

	@JacksonXmlProperty(localName = "qCom")
	@Column(name = "qcom")
	private String qcom;

	@JacksonXmlProperty(localName = "vUnCom")
	@Column(name = "vuncom")
	private String vuncom;

	@JacksonXmlProperty(localName = "vProd")
	@Column(name = "vprod")
	private String vprod;

	@JacksonXmlProperty(localName = "cEANTrib")
	@Column(name = "ceantrib")
	private String ceantrib;

	@JacksonXmlProperty(localName = "uTrib")
	@Column(name = "utrib")
	private String utrib;

	@JacksonXmlProperty(localName = "vUnTrib")
	@Column(name = "vuntrib")
	private String vuntrib;

	@JacksonXmlProperty(localName = "indTot")
	@Column(name = "indtot")
	private String indtot;

	@JacksonXmlProperty(localName = "xPed")
	@Column(name = "xped")
	private String xped;
	
	public Prod() {}
	
	public Prod(Long id, String cprod, String cean, String xprod, String ncm, String cest, String indescala,
			String cfop, String kg, String qcom, String vuncom, String vprod, String ceantrib, String utrib,
			String vuntrib, String indtot, String xped) {
		this.id = id;
		this.cprod = cprod;
		this.cean = cean;
		this.xprod = xprod;
		this.ncm = ncm;
		this.cest = cest;
		this.indescala = indescala;
		this.cfop = cfop;
		this.kg = kg;
		this.qcom = qcom;
		this.vuncom = vuncom;
		this.vprod = vprod;
		this.ceantrib = ceantrib;
		this.utrib = utrib;
		this.vuntrib = vuntrib;
		this.indtot = indtot;
		this.xped = xped;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCprod() {
		return cprod;
	}
	public void setCprod(String cprod) {
		this.cprod = cprod;
	}
	public String getCean() {
		return cean;
	}
	public void setCean(String cean) {
		this.cean = cean;
	}
	public String getXprod() {
		return xprod;
	}
	public void setXprod(String xprod) {
		this.xprod = xprod;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public String getCest() {
		return cest;
	}
	public void setCest(String cest) {
		this.cest = cest;
	}
	public String getIndescala() {
		return indescala;
	}
	public void setIndescala(String indescala) {
		this.indescala = indescala;
	}
	public String getCfop() {
		return cfop;
	}
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}
	public String getKg() {
		return kg;
	}
	public void setKg(String kg) {
		this.kg = kg;
	}
	public String getQcom() {
		return qcom;
	}
	public void setQcom(String qcom) {
		this.qcom = qcom;
	}
	public String getVuncom() {
		return vuncom;
	}
	public void setVuncom(String vuncom) {
		this.vuncom = vuncom;
	}
	public String getVprod() {
		return vprod;
	}
	public void setVprod(String vprod) {
		this.vprod = vprod;
	}
	public String getCeantrib() {
		return ceantrib;
	}
	public void setCeantrib(String ceantrib) {
		this.ceantrib = ceantrib;
	}
	public String getUtrib() {
		return utrib;
	}
	public void setUtrib(String utrib) {
		this.utrib = utrib;
	}
	public String getVuntrib() {
		return vuntrib;
	}
	public void setVuntrib(String vuntrib) {
		this.vuntrib = vuntrib;
	}
	public String getIndtot() {
		return indtot;
	}
	public void setIndtot(String indtot) {
		this.indtot = indtot;
	}
	public String getXped() {
		return xped;
	}
	public void setXped(String xped) {
		this.xped = xped;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cean, ceantrib, cest, cfop, cprod, id, indescala, indtot, kg, ncm, qcom, utrib, vprod,
				vuncom, vuntrib, xped, xprod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prod other = (Prod) obj;
		return Objects.equals(cean, other.cean) && Objects.equals(ceantrib, other.ceantrib)
				&& Objects.equals(cest, other.cest) && Objects.equals(cfop, other.cfop)
				&& Objects.equals(cprod, other.cprod) && Objects.equals(id, other.id)
				&& Objects.equals(indescala, other.indescala) && Objects.equals(indtot, other.indtot)
				&& Objects.equals(kg, other.kg) && Objects.equals(ncm, other.ncm) && Objects.equals(qcom, other.qcom)
				&& Objects.equals(utrib, other.utrib) && Objects.equals(vprod, other.vprod)
				&& Objects.equals(vuncom, other.vuncom) && Objects.equals(vuntrib, other.vuntrib)
				&& Objects.equals(xped, other.xped) && Objects.equals(xprod, other.xprod);
	}

	@Override
	public String toString() {
		return "Prod [id=" + id + ", cprod=" + cprod + ", cean=" + cean + ", xprod=" + xprod + ", ncm=" + ncm
				+ ", cest=" + cest + ", indescala=" + indescala + ", cfop=" + cfop + ", kg=" + kg + ", qcom=" + qcom
				+ ", vuncom=" + vuncom + ", vprod=" + vprod + ", ceantrib=" + ceantrib + ", utrib=" + utrib
				+ ", vuntrib=" + vuntrib + ", indtot=" + indtot + ", xped=" + xped + "]";
	}
	
	
}
