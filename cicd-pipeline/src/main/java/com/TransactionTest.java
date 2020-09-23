package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@SpringBootTest
class TransactionTest {

	Transaction bankTransaction = new Transaction();
	@Test
	void testGreetings() {
		
		assertEquals("Hello",bankTransaction.greetings());
	}

	@Test
	void testGreetingsretunsunexpectedvalue() {
		
		assertNotEquals("Good Morning",bankTransaction.greetings());
	}

	
	@Test
	void testDeposit() {
		assertEquals(1000, bankTransaction.deposit(1000));
		
	}

	@Test
	void testDeposireturnswrongvalue() {
		assertNotEquals(2000, bankTransaction.deposit(1000));
		
	}
	
	@Test
	void testwithdraw() {
		assertEquals(1000, bankTransaction.withdraw(500));
		
	}

	@Test
	void testwithdrawreturnswrongvalue() {
		assertNotEquals(2000, bankTransaction.withdraw(1000));
		
	}
	
}
