package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductDetails {
	
	ProductDetails product = new ProductDetails();

	@Test
	void testGetname() {
          String name = "SamsungMobile";
          assertEquals(name,product.getname());
      	}

	@Test
	void testGetPrice() {
      float price = 2000;
      assertEquals(price,product.getPrice(2000));
	}

	@Test
	void testBillamount() {
		int quantity=5;
		float price = 300;
		assertEquals(1500, product.billamount(quantity, price));
	}

	@Test
	void testTax() {
		float taxpercent = 5;
		float price = 1000;
		assertEquals(50.0, product.tax(price, taxpercent));
	}

}
