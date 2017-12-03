package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ledgerbook.dao.AccountNumberDao;

public interface AccountNumberRepository extends MongoRepository<AccountNumberDao, String> {

	AccountNumberDao findByNumber(String string);

	AccountNumberDao findById(String id);

}
