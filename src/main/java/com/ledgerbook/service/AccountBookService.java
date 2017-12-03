package com.ledgerbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgerbook.dao.AccountNumberDao;
import com.ledgerbook.dto.AccountNumbersDto;
import com.ledgerbook.repository.AccountLevelRepository;
import com.ledgerbook.repository.AccountNumberRepository;

@Service
public class AccountBookService {
	@Autowired
	private AccountNumberRepository accountNumberRepository;
	@Autowired
	private AccountLevelRepository accountLevelRepository;

	public List<AccountNumberDao> getBooks() {
		return this.accountNumberRepository.findAll();
	}

	public void saveAccountNumber(AccountNumbersDto number) {
		this.accountNumberRepository.save(new AccountNumberDao(number.getNumber(), number.getName(),
				number.getDescription(), this.accountLevelRepository.findById(number.getAccountLevelId())));

	}

	// FIX: IF account form send null values there is possible to lose data
	public boolean updateAccountNumber(AccountNumberDao account, AccountNumbersDto accountDto) {
		try {
			System.out.println(" first dto check:  " + accountDto.getNumber());
			account.setDescription(accountDto.getDescription());
			account.setName(accountDto.getName());
			account.setNumber(accountDto.getNumber());
			account.setModifierData();
			System.out.println(" second dao check:  " + account.getNumber());
			this.accountNumberRepository.save(account);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
