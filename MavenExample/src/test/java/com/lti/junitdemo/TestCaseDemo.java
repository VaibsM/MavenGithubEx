package com.lti.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class TestCaseDemo {

	@BeforeAll
    static void setup(){
        System.out.println("Only once in the beggining - @BeforeAll executed\n");
    }     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }      
    @Test
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }  
    //@Disabled
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }     
    @AfterAll
    static void tear(){
        System.out.println("\nOnce at the end - clean up @AfterAll executed");
    }
    
    /*
    @Test
	public void testExceptions() {		
		
	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("100assff");
	        });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
	}
	*/
}
