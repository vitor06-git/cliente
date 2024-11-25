package com.maddytec.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddytec.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
