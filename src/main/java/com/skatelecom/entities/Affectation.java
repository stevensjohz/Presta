/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.entities;

import java.io.Serializable;
import java.sql.Date;
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
public class Affectation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long idAffectation;
    private Date dateAffectation;
    private Boolean Actif;
    
    @ManyToOne
    @JoinColumn(name = "matri_emp")
    private Employe employe;
    
    @ManyToOne
    @JoinColumn(name="num_equip")
    private Equipe equipe;

   

	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Affectation(Long idAffectation, Date dateAffectation, Boolean Actif, Employe employe) {
        this.idAffectation = idAffectation;
        this.dateAffectation = dateAffectation;
        this.Actif = Actif;
        this.employe = employe;
    }

    public Long getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(Long idAffectation) {
        this.idAffectation = idAffectation;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public Boolean getActif() {
        return Actif;
    }

    public void setActif(Boolean Actif) {
        this.Actif = Actif;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
}
