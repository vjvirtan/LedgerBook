package com.ledgerbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ledgerbook.service.TransactionRestService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionRestService transactionRestService;

}
