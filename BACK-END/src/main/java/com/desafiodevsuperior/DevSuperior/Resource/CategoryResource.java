package com.desafiodevsuperior.DevSuperior.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiodevsuperior.DevSuperior.entities.Category;
import com.desafiodevsuperior.DevSuperior.services.CategoryServices;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryServices service;

	@GetMapping
	public ResponseEntity<List<Category>> finAll() {
		List<Category> list = service.finAll();
		return ResponseEntity.ok().body(list);
		
	}
}
