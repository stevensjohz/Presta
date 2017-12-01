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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author STEVENS
 */
@Entity
public class Client implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue
    private Long codeClient;

    @NotEmpty
    private String nomClient;
    @NotEmpty
    private String adressClient;
   
    private Integer contactClient;
    @OneToMany(mappedBy ="client",fetch = FetchType.LAZY)
    private Collection<Site> sites;

    
    
    public Client() 
    {
        super();
    }
    
    
    public Client(String nomClient, String adressClient, Integer contactClient) {
       super();
        this.nomClient = nomClient;
         this.adressClient = adressClient;
        this.contactClient = contactClient;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public Integer getContactClient() {
        return contactClient;
    }

    public void setContactClient(Integer contactClient) {
        this.contactClient = contactClient;
    }

    public Collection<Site> getSites() {
        return sites;
    }

    public void setSites(Collection<Site> sites) {
        this.sites = sites;
    }

    
}
 
