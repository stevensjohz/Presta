package com.skatelecom.web;


import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.validation.Valid;

import com.skatelecom.dao.ClientRepository;
import com.skatelecom.entities.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/Client")
			
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping(value="/Index")
	public String Index(Model model,
			@RequestParam(name="page",defaultValue="0")int p, 
		   
	      @RequestParam(name="motCle",defaultValue="")String mc)  {
		 Page<Client> cl=clientRepository.chercherClients("%"+mc+"%",new PageRequest(p, 5));
		
		int pagesCount=cl.getTotalPages();
		int [] pages=new int[pagesCount];
		for(int i=0;i<pagesCount;i++)
			pages[i]=i;
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", p);
		model.addAttribute("motCle", mc);
		
		model.addAttribute("pageClients", cl);
		return "clients";
		
	}
	
	
	@RequestMapping(value="/formClient",method=RequestMethod.GET)
	public String formClient(Model model) {
		model.addAttribute("client", new Client());
		
		return"formClient";
		
	}
	@RequestMapping(value="/saveClient",method=RequestMethod.POST)
	public String save(@Valid Client cl,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return"formClient";
		}
		clientRepository.save(cl);
		
		return "redirect:Index";
		
	}
	@RequestMapping(value="/supprimer")
	public String supprimer(Long id) {
		
		clientRepository.delete(id);
		return "redirect:Index";
	
	}
	
	@RequestMapping(value="/modifier")
	public String modifier(Long id,Model model) {
		Client cl=clientRepository.getOne(id);
		model.addAttribute("client",cl);
		
		return "redirect:EditClient";
		
				}
	
	
	
	@RequestMapping(value="/updateClient",method=RequestMethod.POST)
	public String update(@Valid Client cl,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return"EditClient";
		}
		clientRepository.save(cl);
		
		return "redirect:Index";
		
	}
	
	
	
	}


