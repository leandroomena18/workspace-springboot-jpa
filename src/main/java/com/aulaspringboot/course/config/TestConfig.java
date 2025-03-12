package com.aulaspringboot.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulaspringboot.course.entities.Order;
import com.aulaspringboot.course.entities.User;
import com.aulaspringboot.course.repositories.OrderRepository;
import com.aulaspringboot.course.repositories.UserRepository;

@Configuration //indica que é uma classe de configuração
@Profile("test")//config especifica pára o perfil test 
public class TestConfig  implements CommandLineRunner{ //interface com o método (run) pra rodar o programa
	
	@Autowired  //forma de fazer a injeção de dependência automática do Spring
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2)); //recebe uma lista de obj que serão adic. ao banco de dados
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}
}
