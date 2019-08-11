package com.example;

import java.lang.annotation.Annotation;

import org.concordion.api.ConcordionResources;
import org.concordion.api.ExpectedToFail;
import org.concordion.api.Unimplemented;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)

public class MultiplyTwoNumbersTest {
	 int factor;
	 
	 public MultiplyTwoNumbersTest(){
		 System.out.println("constructor");
	 }
	public int getResult(int firstNumber,int secondNumber) {
		return firstNumber*secondNumber*factor;
	}
	
	
	
	
	public void deriveCommonNumber(int commonNumber) {
		factor=commonNumber*2;
	}
	
	

}
