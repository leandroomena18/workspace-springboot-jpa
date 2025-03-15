package com.aulaspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	//o JPA já possui uma implementação padrão para essa interface

}
