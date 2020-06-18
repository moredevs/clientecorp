package com.prueba.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.clientes.model.Cliente;
import com.prueba.clientes.service.ClienteService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "IntercorpController" }, produces = "application/json", value = "")
public class IntercorpController {

	@Autowired
	private ClienteService service;
	
	 @GetMapping("")
	 public String  init() {
	   return "intercorp service";
	 }
	 
	 @RequestMapping(value = "/creacliente", method = RequestMethod.POST)
	    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) throws Exception {
		 Cliente userCreated = service.createClient(cliente);
	        return new ResponseEntity(userCreated, HttpStatus.CREATED);
	    }
}
