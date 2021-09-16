	package com.lti.junitdemo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {
	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	void testShow() {
		MyApp m = new MyApp();
		String s = m.show();
		Assertions.assertEquals("Hello, Maven!", s);
	}
	
	@Test
	void testAdd() {
		int result = Calculator.add(300, 400);
		Assertions.assertEquals(700, result);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Vaibhav".length() == 10);
		Assertions.assertFalse(10 >= 20, "Comparing two values");
	}
	
	@Test
	void testAssertNullAndNotNull() {
		String s1 = null;
		String s2 = "";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	/*
	@Test
	void testAssertAll() {
		String str1 = "Abc";
		String str2 = "Pqr";
		String str3 = "Xyz";
		Assertions.assertAll(
				() -> Assertions.assertEquals("Abc", str1),
				() -> Assertions.assertEquals("Pqr", str2),
				() -> Assertions.assertEquals("Xyz", str3)
		);
	}
	*/
	
	@Test
	void testCollections() {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Hello!");
		Assertions.assertFalse(myList.isEmpty());
	}

}
