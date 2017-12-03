package com.ledgerbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgerbook.repository.AccountTransactionHeaderRepository;
import com.ledgerbook.repository.AccountTransactionRowRepository;

@Service
public class TransactionRestService {

	@Autowired
	private AccountTransactionRowRepository accountTransactionRowRepository;
	@Autowired
	private AccountTransactionHeaderRepository accountTransactionHeaderRepository;
	
	
}
