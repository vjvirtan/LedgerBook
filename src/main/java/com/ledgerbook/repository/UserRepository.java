package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ledgerbook.config.UserDao;

@Repository
public interface UserRepository extends MongoRepository<UserDao, String> {

	UserDao findByName(String string);

}
