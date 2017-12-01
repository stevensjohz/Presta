/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author STEVENS
 */
@Entity
public class Materiel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long idMateriel;
    private String libelleMateriel;
    private String observationMateriel;
    @OneToMany(mappedBy = "materiel",fetch = FetchType.LAZY)
    Collection<Utilisation> utilisations;

   
    public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel(String libelleMateriel, String observationMateriel, Collection<Utilisation> utilisations) {
        this.libelleMateriel = libelleMateriel;
        this.observationMateriel = observationMateriel;
        this.utilisations = utilisations;
    }

    public Long getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(Long idMateriel) {
        this.idMateriel = idMateriel;
    }

    public String getLibelleMateriel() {
        return libelleMateriel;
    }

    public void setLibelleMateriel(String libelleMateriel) {
        this.libelleMateriel = libelleMateriel;
    }

    public String getObservationMateriel() {
        return observationMateriel;
    }

    public void setObservationMateriel(String observationMateriel) {
        this.observationMateriel = observationMateriel;
    }

    public Collection<Utilisation> getUtilisations() {
        return utilisations;
    }

    public void setUtilisations(Collection<Utilisation> utilisations) {
        this.utilisations = utilisations;
    }
    
}
