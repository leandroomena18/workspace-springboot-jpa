package com.aulaspringboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.course.entities.Order;
import com.aulaspringboot.course.repositories.OrderRepository;

@Service //poderia ser @component ou @Repository
public class OrderService {
	
	@Autowired //não precisa registrar como componente pq estende a JpaRepoitory que já é resgistrada
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id); //optional usado para evitar erros com null
		return obj.get(); //retorna um objeto do tipo User dentro de optional
	}

}
