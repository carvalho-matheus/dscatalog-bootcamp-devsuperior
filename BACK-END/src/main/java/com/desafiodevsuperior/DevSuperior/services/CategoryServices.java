package com.desafiodevsuperior.DevSuperior.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafiodevsuperior.DevSuperior.entities.Category;
import com.desafiodevsuperior.DevSuperior.repostitories.CategoryRepository;

@Service
public class CategoryServices {
	
	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<Category> finAll() {
		return repository.findAll();
	}
}
