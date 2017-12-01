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
public class Employe implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private String matriculeEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    @OneToMany(mappedBy = "employe",fetch = FetchType.LAZY)
    Collection<Affectation> affectations;

   

    public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nomEmploye, String prenomEmploye, Collection<Affectation> affectations) {
        this.nomEmploye = nomEmploye;
        this.prenomEmploye = prenomEmploye;
        this.affectations = affectations;
    }

    public String getMatriculeEmploye() {
        return matriculeEmploye;
    }

    public void setMatriculeEmploye(String matriculeEmploye) {
        this.matriculeEmploye = matriculeEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public Collection<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(Collection<Affectation> affectations) {
        this.affectations = affectations;
    }
    
    
}
