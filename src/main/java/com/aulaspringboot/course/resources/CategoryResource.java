package com.aulaspringboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspringboot.course.entities.Category;
import com.aulaspringboot.course.services.CategoryService;

@RestController //recurso web implementado por controlador rest - faz requisições http
@RequestMapping(value = "/Categories") //nomeando o recurso - usa esse nome no localhost8080/Categorys
public class CategoryResource {
	
	@Autowired //injeção de dependência - associa uma instancia de CategoryRepository - Obs tem que regitrar como componente
	private CategoryService service;
	
	@GetMapping // requisição do tipo get do http
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //colocamos um parametro do tipo id na url
	public ResponseEntity<Category> findById(@PathVariable Long id){ //@ PathVariable configura para aceitar o id como parâmetro na url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

		
}
