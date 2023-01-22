package br.com.eliarlan.emoney.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eliarlan.emoney.domain.model.Category;
import br.com.eliarlan.emoney.domain.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> getAll(){
		return repository.findAll();
	}
	
	public Category save(Category category) {
		return repository.save(category);
	}
}