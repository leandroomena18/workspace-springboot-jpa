package com.aulaspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//o JPA já possui uma implementação padrão para essa interface

}
