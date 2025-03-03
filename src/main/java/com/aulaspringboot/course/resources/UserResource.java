package com.aulaspringboot.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspringboot.course.entities.User;

@RestController //recurso web implementado por controlador rest
@RequestMapping(value = "/users") //nomeando o recurso - usa esse nome no localhost8080/users
public class UserResource {
	
	//class para testar se o recurso está funcionado 
	
	@GetMapping //indica que responde a uma requisição do tipo get do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria Clara", "MariaClara@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
		
		//responseEntity classe que retorna requisições web
		//.ok() retorna resposta com sucesso no http
		//.body(<user) retorna o corpo do usuário que acabou de instanciar
	}

		
}
