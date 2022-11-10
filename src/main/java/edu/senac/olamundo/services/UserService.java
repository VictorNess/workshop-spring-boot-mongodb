package edu.senac.olamundo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.senac.olamundo.domain.User;
import edu.senac.olamundo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	// Mecanismo de injeção de dependências do SpringBoot
	// Esse método localiza e trás um objeto com as propriedades da Interface Repository
	private UserRepository repo;
	
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
}
