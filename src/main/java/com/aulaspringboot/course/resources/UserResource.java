package com.aulaspringboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspringboot.course.entities.User;
import com.aulaspringboot.course.services.UserService;

@RestController //recurso web implementado por controlador rest - faz requisições http
@RequestMapping(value = "/users") //nomeando o recurso - usa esse nome no localhost8080/users
public class UserResource {

/*class para testar se o recurso está funcionado 

@GetMapping //indica que responde a uma requisição do tipo get do http
public ResponseEntity<User> findAll() {
	User u = new User(1L, "Maria Clara", "MariaClara@gmail.com", "999999", "12345");
	return ResponseEntity.ok().body(u);
	
	//responseEntity classe que retorna requisições web
	//.ok() retorna resposta com sucesso no http
	//.body(<user) retorna o corpo do usuário que acabou de instanciar
}
*/
	
	@Autowired //registar a classe UserService como componente
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //colocamos um parametro do tipo id na url
	public ResponseEntity<User> findById(@PathVariable Long id){ //@ PathVariable configura para aceitar o id como parâmetro na url
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

		
}
