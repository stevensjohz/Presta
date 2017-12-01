/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.dao;
import com.skatelecom.entities.Travail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author STEVENS
 */
public interface TravailRepository extends JpaRepository<Travail, Long>{
    
}
