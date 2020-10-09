package com.desafiodevsuperior.DevSuperior.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiodevsuperior.DevSuperior.dto.CategoryDTO;
import com.desafiodevsuperior.DevSuperior.entities.Category;
import com.desafiodevsuperior.DevSuperior.services.CategoryServices;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryServices service;

	@GetMapping
	public ResponseEntity<List<CategoryDTO>> finAll() {
		List<CategoryDTO> list = service.finAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
		CategoryDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
