package com.ledgerbook.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ledgerbook.dao.AccountLevelDao;
import com.ledgerbook.dao.AccountNumberDao;
import com.ledgerbook.dao.TaxDao;
import com.ledgerbook.repository.AccountLevelRepository;
import com.ledgerbook.repository.AccountNumberRepository;
import com.ledgerbook.repository.TaxRepository;
import com.ledgerbook.repository.UserRepository;

@Component
public class PrePopulate implements CommandLineRunner {

	@Autowired
	private TaxRepository taxRepository;

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private AccountLevelRepository accountLevelRepository;
	@Autowired
	private AccountNumberRepository accountNumberRepository;

	@Override
	public void run(String... strings) throws Exception {
		UserDao user = new UserDao("testaaja");
		this.userRepo.save(user);

		TaxDao tax = new TaxDao("ALV24", 24.0, "FI", "default tax", true, 0);

		this.taxRepository.save(tax);
		TaxDao taxget = this.taxRepository.findByName("ALV24");
		System.out.println(taxget.getTaxArea());

		System.out.println(user.toString());

		AccountLevelDao level = new AccountLevelDao("a", "Sales", " testing api levels");
		this.accountLevelRepository.save(level);
		this.accountNumberRepository.save(new AccountNumberDao("3000", "Sales", "Homeland sales", level));

	}

}
