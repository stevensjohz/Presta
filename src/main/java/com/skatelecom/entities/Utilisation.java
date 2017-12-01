/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author STEVENS
 */
@Entity
public class Utilisation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long idUtilisation;
    private Double quantite;
    
    @ManyToOne
    @JoinColumn(name = "id_materiel")
    private Materiel materiel;
    
    @ManyToOne
    @JoinColumn(name = "id_travail")
    private Travail travail;
    
    
      
    
     public Utilisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisation(Double quantite, Materiel materiel, Travail travail) {
        this.quantite = quantite;
        this.materiel = materiel;
        this.travail = travail;
    }

    public Long getIdUtilisation() {
        return idUtilisation;
    }

    public void setIdUtilisation(Long idUtilisation) {
        this.idUtilisation = idUtilisation;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Travail getTravail() {
        return travail;
    }

    public void setTravail(Travail travail) {
        this.travail = travail;
    }

   

 
    
}
