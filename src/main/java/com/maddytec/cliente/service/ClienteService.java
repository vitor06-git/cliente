package com.maddytec.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maddytec.cliente.entity.Cliente;
import com.maddytec.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> listaCliente(){
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> buscarPorId(Long id){
		return clienteRepository.findById(id);
	}
	
	public void removerPorId(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
