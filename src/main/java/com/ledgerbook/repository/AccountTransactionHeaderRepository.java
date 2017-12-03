package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ledgerbook.dao.AccountTransactionHeaderDao;

@Repository
public interface AccountTransactionHeaderRepository extends MongoRepository<AccountTransactionHeaderDao, String> {

}
