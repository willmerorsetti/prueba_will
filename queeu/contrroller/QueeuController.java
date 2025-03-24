package com.aleal.queeu.contrroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleal.queeu.model.Queeu;
import com.aleal.queeu.services.IQueeuService;
import com.aleal.queeu.services.IQueeuPoolService;
@RestController
public class QueeuController {

	@Autowired
	private IQueeuService service;
	@Autowired
	private IQueeuPoolService servicePool;
	
	@GetMapping("queeu")
	public List<Queeu> search(){
		return (List<Queeu>) this.service.search();	
	}
		
	@GetMapping("queeuPool")
	public String procesar(){
		return  this.servicePool.procesar();	
	}

}
