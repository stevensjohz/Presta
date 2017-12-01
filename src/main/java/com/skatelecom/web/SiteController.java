package com.skatelecom.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skatelecom.dao.SiteRepository;
@Controller
public class SiteController {
	@Autowired
	private SiteRepository siteRepository;
	
	
	

}
