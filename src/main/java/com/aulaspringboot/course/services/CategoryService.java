package com.aulaspringboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.course.entities.Category;
import com.aulaspringboot.course.repositories.CategoryRepository;

@Service // poderia ser @component ou @Repository
public class CategoryService {

	@Autowired // não precisa registrar como componente pq estende a JpaRepoitory que já é
				// resgistrada
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); // optional usado para evitar erros com null
		return obj.get(); // retorna um objeto do tipo Category dentro de optional
	}

}
