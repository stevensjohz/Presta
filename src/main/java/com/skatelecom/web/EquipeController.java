package com.skatelecom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.skatelecom.dao.EquipeRepository;
@Controller
public class EquipeController {
	@Autowired
	private EquipeRepository equipeRepository;
	
	

}
