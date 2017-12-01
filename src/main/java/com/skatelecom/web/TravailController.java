package com.skatelecom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.skatelecom.dao.TravailRepository;

@Controller
public class TravailController {
@Autowired
private TravailRepository travailRepository;
}
