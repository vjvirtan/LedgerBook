package com.ledgerbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ledgerbook.dao.TaxDao;

@Repository
public interface TaxRepository extends MongoRepository<TaxDao, String> {
	TaxDao findByName(String name);
}
