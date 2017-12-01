/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author STEVENS
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_TRAVAIL") 

public class Travail implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
     private Long idTravail;
     
     private Date dateDebut;
     private Date dateFin;
     private String motif;
     private String observation;
     
     @ManyToOne
     @JoinColumn(name = "num_equipe")
     private Equipe equipe;
     
     @ManyToOne
     @JoinColumn(name = "id_site")     
     private Site site;
     
    
     @OneToMany(mappedBy = "travail",fetch = FetchType.LAZY)
     private Collection<Utilisation>utilisations;

     
    

    public Travail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Travail(Date dateDebut, Date dateFin, String motif) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.motif = motif;
    }

    public Long getIdTravail() {
        return idTravail;
    }

    public void setIdTravail(Long idTravail) {
        this.idTravail = idTravail;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

   

    public Collection<Utilisation> getUtilisations() {
        return utilisations;
    }

    public void setUtilisations(Collection<Utilisation> utilisations) {
        this.utilisations = utilisations;
    }
     
     
}
