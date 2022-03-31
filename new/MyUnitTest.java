package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.day1.MyUnit;

class MyUnitTest {
	private MyUnit obj=new MyUnit();
	
	@Test
	void test1() {
		assertEquals("chinnisumanth", obj.stringConcat("chinni", "sumanth"));
	}
	
	@Test
	void test2() {
		assertEquals("shanmukhasumanth", obj.stringConcat("shanmukha", "sumanth"));
	}

	@Test
	void test3() {
		assertNotEquals("chinnisumanth", obj.stringConcat("shanmukha", "sumanth"));
	}

}
