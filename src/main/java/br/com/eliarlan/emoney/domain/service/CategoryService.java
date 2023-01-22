package br.com.eliarlan.emoney.domain.service;

import java.util.List;
import java.util.Optional;

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

	public Optional<Category> findById(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}
