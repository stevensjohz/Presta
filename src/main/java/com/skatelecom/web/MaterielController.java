package com.skatelecom.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skatelecom.dao.MaterielRepository;
import com.skatelecom.entities.Materiel;

@Controller
public class MaterielController {
	
	@Autowired
	private MaterielRepository materielRepository;
	

	
}
