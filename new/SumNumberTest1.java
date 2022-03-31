package com.training;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;

import org.junit.jupiter.api.TestFactory;

import com.training.day1.SumNumbers;

class SumNumberTest1 {
	
	private SumNumbers obj1=new SumNumbers();

	@TestFactory
	public Stream<DynamicTest> testAdditons() {
		int[][] data=new int[][] {{3,4,7},{4,2,5},{3,4,7}};
		return Arrays.stream(data).map(entry->{
		int a=entry[0];
		int b=entry[1];
		int sum=entry[2];
		return dynamicTest(a+" + "+b+" = "+sum, () ->{
			assertEquals(sum,obj1.sum(a,b));
		});
		});
		
		
		
	}

}
