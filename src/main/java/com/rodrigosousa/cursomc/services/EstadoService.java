package com.rodrigosousa.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigosousa.cursomc.domain.Estado;
import com.rodrigosousa.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll(){
		return repo.findByOrderByNome();
	}
}
