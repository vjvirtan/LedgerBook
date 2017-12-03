package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ledgerbook.dao.AccountTransactionRowDao;

@Repository
public interface AccountTransactionRowRepository extends MongoRepository<AccountTransactionRowDao, String> {

}
