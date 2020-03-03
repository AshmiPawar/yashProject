package com.yash.FindWrongNumber;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class FindWorngNumberTest  {

	private FindWorngNumber wrongNumber = new FindWorngNumber();
	@Test
	public void shouldGetNineteenAsWrongNumber() {
		
		Integer expectedWrongNumber = 19;
		
		Integer actualWrongNumber = wrongNumber.findingwrongNumber(Arrays.asList(3,12,8,19,13,32,18,42,23,52));
	
	    assertEquals(expectedWrongNumber,actualWrongNumber);
	}
	
	
	@Test
	public void shouldGetZeroIfNoWrongNumberIsPresent() {
		
		Integer expectedWrongNumber = 0;
		
		Integer actualWrongNumber = wrongNumber.findingwrongNumber(Arrays.asList(3,12,8,22,13,32,18,42,23,52));
	
	    assertEquals(expectedWrongNumber,actualWrongNumber);
	}
	
	@Test
	public void shouldGetNineAsWrongNumber() {
		
		Integer expectedWrongNumber = 9;
		
		Integer actualWrongNumber = wrongNumber.findingwrongNumber(Arrays.asList(3,12,9,22,13,32,18,42,23,52));
	
	    assertEquals(expectedWrongNumber,actualWrongNumber);
	}
}
