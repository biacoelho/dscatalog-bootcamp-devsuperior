package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	/**
	 * acessar o repository e chamar lá no
	 * banco de dados as categorias
	 * @return categorias
	 */
	public List<Category> findAll() {
		return repository.findAll();
	}
}
