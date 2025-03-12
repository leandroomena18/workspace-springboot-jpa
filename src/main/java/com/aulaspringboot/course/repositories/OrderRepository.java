package com.aulaspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	//o JPA já possui uma implementação padrão para essa interface

}
