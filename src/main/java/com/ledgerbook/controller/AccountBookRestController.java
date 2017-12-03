package com.ledgerbook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ledgerbook.dao.AccountNumberDao;
import com.ledgerbook.dto.AccountNumbersDto;
import com.ledgerbook.repository.AccountNumberRepository;
import com.ledgerbook.service.AccountBookService;

/*
 * Rest Api for account numbers, levels, report admnistration
 */

@RestController
@RequestMapping("api/account/v1")
public class AccountBookRestController {
	@Autowired
	private AccountNumberRepository accountNumberRepository;
	@Autowired
	private AccountBookService accountBookService;

	@GetMapping()
	public List<AccountNumberDao> getBooks() {
		return this.accountNumberRepository.findAll();
	}

	// FIX: not found error
	@GetMapping(value = "{id}")
	public AccountNumberDao getAccountNumber(@PathVariable String id) {
		AccountNumberDao account = this.accountNumberRepository.findById(id);
		if (account == null)
			throw new IllegalArgumentException();

		return account;
	}

	// TODO: confirm exceptions correctness
	@PutMapping(value = "{id}")
	public AccountNumberDao updateAccountNumber(@Valid @PathVariable String id,
			@RequestBody AccountNumbersDto accountDto) {
		AccountNumberDao account = this.accountNumberRepository.findById(id);
		if (!this.accountBookService.updateAccountNumber(account, accountDto) || account == null)
			throw new IllegalArgumentException();

		return this.accountNumberRepository.findById(id);
	}

	// TODO: return value?
	@DeleteMapping(value = "/{id}")
	public HttpStatus deleteAccountNumber(@PathVariable String id) {
		try {

			this.accountNumberRepository.delete(this.accountNumberRepository.findById(id));

		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		return HttpStatus.ACCEPTED;
	}

	// TODO: error handling?
	@PostMapping("")
	public AccountNumbersDto postAccountNumber(@Valid @RequestBody AccountNumbersDto book) {
		try {
			this.accountBookService.saveAccountNumber(book);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}

		return book;
	}

}
