package com.prueba.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.clientes.model.Cliente;
import com.prueba.clientes.repository.ClienteRepository;
import lombok.Getter;
import lombok.Setter;
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clientrepo;
	
	public Cliente createClient(Cliente cliente) throws Exception {
		System.out.print(cliente.getApellido());
		return clientrepo.save(cliente);
	}
}
