package edu.senac.olamundo.resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.senac.olamundo.domain.User;
import edu.senac.olamundo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	
	//Tipo de Requisição feita com a API
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		// Criação de objetos com parametros do construtor sobrecarregado
		
		// Como o List é uma interface, ele não pode ser instanciado, então temos que usar uma estrutura 
		// que possa instanciar, como o Arraylist para listar os usuários cadastrados
		List<User> list = service.findAll();
						
		// Retorno esperado pela Entity (Status: 200 - OK)
		// As informações do body devem ser os usuários e suas propriedades
		// em formato JSON
		return ResponseEntity.ok().body(list);
		
	}
	
	
}
