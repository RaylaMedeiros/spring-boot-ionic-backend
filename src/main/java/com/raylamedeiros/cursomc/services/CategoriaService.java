package com.raylamedeiros.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raylamedeiros.cursomc.domain.Categoria;
import com.raylamedeiros.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria busca(Integer id) {
		Categoria obj = repo.findOne(id);
		
		return obj;
	}
}
