package com.skatelecom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skatelecom.dao.AffectationRepository;

@Controller
public class AffectationController {
	@Autowired
	private AffectationRepository affectationRepository;

}
