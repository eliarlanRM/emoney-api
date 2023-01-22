package br.com.eliarlan.emoney.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliarlan.emoney.domain.model.Category;
import br.com.eliarlan.emoney.domain.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService sevice;
	
	@GetMapping
	public List<Category> getAll(){
		return sevice.getAll();
	}
	
	@PostMapping
	public ResponseEntity<Category> addCategory(@Valid @RequestBody Category category) {
		Category savedCategory = sevice.save(category);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);
	}
}
