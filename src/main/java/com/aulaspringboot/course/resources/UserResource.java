package com.aulaspringboot.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspringboot.course.entities.User;

@RestController //recurso web impl por controlador rest
@RequestMapping(value = "/users") //nomeando o recurso
public class UserResource {
	
	//class para testar se o recurso está funcionado 
	
	@GetMapping //responde a uma requisição do tipo get do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria Clara", "MariaClara@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
		//.ok() retorna resposta com sucesso no http
		//.body(<user) retorna o corpo do usuário que acabou de instanciar
	}

		
}
