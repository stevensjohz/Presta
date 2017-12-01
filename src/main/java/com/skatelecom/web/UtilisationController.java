package com.skatelecom.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skatelecom.dao.UtilisationRepository;

    @Controller
    public class UtilisationController {
    	@Autowired
		private UtilisationRepository utilisationRepository;
	
}
