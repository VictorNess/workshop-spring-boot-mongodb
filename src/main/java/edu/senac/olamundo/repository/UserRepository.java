package edu.senac.olamundo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.senac.olamundo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
