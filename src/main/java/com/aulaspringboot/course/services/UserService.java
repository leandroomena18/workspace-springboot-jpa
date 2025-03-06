package com.aulaspringboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.course.entities.User;
import com.aulaspringboot.course.repositories.UserRepository;

@Service //poderia ser @component ou @Repository
public class UserService {
	
	@Autowired //não precisa registrar como componente pq estende a JpaRepoitory que já é resgistrada
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id); //optional usado para evitar erros com null
		return obj.get();
	}

}
