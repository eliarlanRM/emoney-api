package br.com.eliarlan.emoney.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eliarlan.emoney.domain.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
