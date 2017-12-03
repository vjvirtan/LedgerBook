package com.ledgerbook.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ledgerbook.dao.TaxDao;
import com.ledgerbook.repository.TaxRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxDaoTest {
	@Autowired
	private TaxRepository taxRepository;

	@Test
	public void test() {
		TaxDao tax = new TaxDao("ALV22", 24.0, "FI", "default tax", true, 0);

		this.taxRepository.save(tax);

		TaxDao result = this.taxRepository.findByName(tax.getName());
		assertNotNull(result);
		assertNotNull(result.getId());
		assertEquals("VAT22", result.getName());
		assertEquals("FI", result.getTaxArea());

	}

}
