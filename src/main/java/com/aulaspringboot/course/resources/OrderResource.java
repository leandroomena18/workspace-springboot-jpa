package com.aulaspringboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspringboot.course.entities.Order;
import com.aulaspringboot.course.services.OrderService;

@RestController // recurso web implementado por controlador rest - faz requisições http
@RequestMapping(value = "/orders") // nomeando o recurso - usa esse nome no localhost8080/Orders
public class OrderResource {

	/*
	 * class para testar se o recurso está funcionado
	 * 
	 * @GetMapping //indica que responde a uma requisição do tipo get do http public
	 * ResponseEntity<Order> findAll() { Order u = new Order(1L, "Maria Clara",
	 * "MariaClara@gmail.com", "999999", "12345"); return
	 * ResponseEntity.ok().body(u);
	 * 
	 * //responseEntity classe que retorna requisições web //.ok() retorna resposta
	 * com sucesso no http //.body(<Order) retorna o corpo do usuário que acabou de
	 * instanciar }
	 */

	@Autowired // injeção de dependência - associa uma instancia de OrderRepository - Obs tem
				// que regitrar como componente
	private OrderService service;

	@GetMapping // requisição do tipo get do http
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}") // colocamos um parametro do tipo id na url
	public ResponseEntity<Order> findById(@PathVariable Long id) { // @ PathVariable configura para aceitar o id como
																	// parâmetro na url
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
