package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

class ProductTestCases {

	@Test
	void testCompanyName() {
		Product p = new Product();
		Assertions.assertEquals("Dmart", p.getCompanyName());
	}

}
