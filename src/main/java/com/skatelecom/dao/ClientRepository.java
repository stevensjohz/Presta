/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatelecom.dao;
import com.skatelecom.entities.Client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author STEVENS
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
	@Query ("select c from Client c where c.nomClient like :x" )
	public Page<Client> chercherClients(@Param("x")String mc,Pageable pageable);
    
}
