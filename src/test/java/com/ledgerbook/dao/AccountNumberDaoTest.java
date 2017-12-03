package com.ledgerbook.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ledgerbook.dao.AccountLevelDao;
import com.ledgerbook.dao.AccountNumberDao;
import com.ledgerbook.repository.AccountNumberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountNumberDaoTest {
	@Autowired
	private AccountNumberRepository accountNumberRepository;

	@Test
	public void test() {
		AccountLevelDao level = new AccountLevelDao("A", "Sales", "main level");
		AccountNumberDao number = new AccountNumberDao("1901", "BankAccount SomeBank", "Primary bank account", level);

		this.accountNumberRepository.save(number);

		AccountNumberDao result = this.accountNumberRepository.findByNumber("1901");
		assertNotNull(result);
		assertEquals("Primary bank account", result.getDescription());
		assertEquals("BankAccount SomeBank", result.getName());
		assertEquals("1901", result.getNumber());
		assertNotNull(result.getCreated());

	}

}
