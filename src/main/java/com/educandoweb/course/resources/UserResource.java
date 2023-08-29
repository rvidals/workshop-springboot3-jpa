package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
//	Método de end point para acessar os dados
	
	@GetMapping
	public ResponseEntity<User> findAll(){
	 //Teste
		User u = new User(1L, "Dara", "dara@gmail.com","9999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
