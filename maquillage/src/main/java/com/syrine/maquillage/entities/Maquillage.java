package com.syrine.maquillage.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Maquillage {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMaquillage;
private String nomMaquillage;
private Double prixMaquillage;
private Date dateCreation;
@ManyToOne
private Brand brand;
public Brand getBrand() {
	return brand;
}
public void setBrand(Brand brand) {
	this.brand = brand;
}
public Maquillage() {
super();
}
public Maquillage(String nomMaquillage, Double prixMaquillage, Date dateCreation) {
super();
this.nomMaquillage = nomMaquillage;
this.prixMaquillage = prixMaquillage;
this.dateCreation = dateCreation;
}
public Long getIdMaquillage() {
return idMaquillage;
}
public void setIdProduit(Long idMaquillage) {
this.idMaquillage = idMaquillage;
}
public String getNomMaquillage() {
return nomMaquillage;
}
public void setNomMaquillage(String nomMaquillage) {
this.nomMaquillage = nomMaquillage;
}
public Double getPrixMaquillage() {
return prixMaquillage;
}
public void setPrixMaquillage(Double prixMaquillage) {
this.prixMaquillage = prixMaquillage;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Maquillage [idMaquillage=" + idMaquillage + ", nomMaquillage=" +
nomMaquillage + ", prixMaquillage=" + prixMaquillage
+ ", dateCreation=" + dateCreation + "]";
}

	
}


