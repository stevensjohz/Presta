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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author STEVENS
 */
@Entity
public class Site implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long codeSide;
    private String nomSite;
    private String adresseSite;
    private Number contactSite;
    @ManyToOne
    @JoinColumn(name="codeClient")
    private Client client;
    
    @OneToMany(mappedBy = "site",fetch = FetchType.LAZY)
    Collection<Travail>travails;

   
    
    
    public Site() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Site(String nomSite, String adresseSite, Number contactSite) {
        this.nomSite = nomSite;
        this.adresseSite = adresseSite;
        this.contactSite = contactSite;
        
    }


    public Long getCodeSide() {
        return codeSide;
    }

    public void setCodeSide(Long codeSide) {
        this.codeSide = codeSide;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public String getAdresseSite() {
        return adresseSite;
    }

    public void setAdresseSite(String adresseSite) {
        this.adresseSite = adresseSite;
    }

    public Number getContactSite() {
        return contactSite;
    }

    public void setContactSite(Number contactSite) {
        this.contactSite = contactSite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   public Collection<Travail> getTravails() {
        return travails;
    }

    public void setTravails(Collection<Travail> travails) {
        this.travails = travails;
    }
    
    
    
    }
