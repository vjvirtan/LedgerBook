package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ledgerbook.config.UserDao;

public interface UserRepository extends MongoRepository<UserDao, String> {
	UserDao findByName(String name);
}
