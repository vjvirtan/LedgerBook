package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ledgerbook.dao.AccountNumberDao;

@Repository
public interface AccountNumberRepository extends MongoRepository<AccountNumberDao, String> {
	AccountNumberDao findByNumber(String number);
}
