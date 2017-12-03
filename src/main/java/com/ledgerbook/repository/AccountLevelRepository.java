package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ledgerbook.dao.AccountLevelDao;

public interface AccountLevelRepository extends MongoRepository<AccountLevelDao, String> {

	AccountLevelDao findById(String id);

}
