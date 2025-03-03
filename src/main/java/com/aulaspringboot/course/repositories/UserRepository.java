package com.aulaspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//o JPA já possui uma implementação padrão para essa interface

}
