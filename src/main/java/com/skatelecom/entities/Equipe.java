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
public class Equipe implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long numeroEquipe;
    private String nomEquipe;
    
    @OneToMany(mappedBy = "equipe",fetch = FetchType.LAZY)
    Collection<Affectation> affectations;
    
    @OneToMany(mappedBy = "equipe",fetch = FetchType.LAZY)
    Collection<Travail> travails;

    
    
    
    public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(String nomEquipe ) {
        this.nomEquipe = nomEquipe;
        
    }

    public Long getNumeroEquipe() {
        return numeroEquipe;
    }

    public void setNumeroEquipe(Long numeroEquipe) {
        this.numeroEquipe = numeroEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Collection<Affectation> getAffectations() {
		return affectations;
	}

	public void setAffectations(Collection<Affectation> affectations) {
		this.affectations = affectations;
	}

	
    
    
}
