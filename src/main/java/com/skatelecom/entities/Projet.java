/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author STEVENS
 */
@Entity
@DiscriminatorValue("projet")
public class Projet extends Travail{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
}
