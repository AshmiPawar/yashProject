package com.yash.NextNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NextNumberTest {

	private NextNumber nextNumber = new NextNumber();
	
	@Test
	public void shouldGetNextNumberTen() {
  
		Integer[] list = {7,10,8,11,9,12};
		Integer expected = 10;
		Integer actual = nextNumber.findNextNumber(list);
		assertEquals(expected,actual);
	}
	
}
