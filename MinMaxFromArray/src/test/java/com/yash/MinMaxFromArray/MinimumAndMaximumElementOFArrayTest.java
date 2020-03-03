package com.yash.MinMaxFromArray;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class MinimumAndMaximumElementOFArrayTest  {

	private MinimumAndMaximumElementOFArray minMax = new MinimumAndMaximumElementOFArray();
	
	@Test
	public void shouldcheckMinimumAndMaximumElementInList() {
	
		Integer[] list = {77,11,33,44,99,66};
		
		List<Integer> expectedList = Arrays.asList(11,99);
		List<Integer> actualList =minMax.findMinimumAndMaximumElementOfArray(list);
		
		assertEquals(expectedList,actualList);
	}
}
