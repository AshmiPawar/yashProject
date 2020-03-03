package com.yash.ReplaceArrayElement;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReplaceArrayElementTest {

	private ReplaceArrayElement replaceArrayElement = new ReplaceArrayElement();

	@Test
	public void shouldReplaceFiveWithSevenInArray() {

		List<Integer> expectedArrayList = Arrays.asList(11, 22, 33, 7, 22);

		List<Integer> actualList = replaceArrayElement.replacingArrayElement(5, 7, Arrays.asList(11, 22, 33, 5, 22));

		assertEquals(expectedArrayList, actualList);
	}

	@Test(expected = NumberNotFoundInListException.class)
	public void shouldThrowNumberNotFoundExceptionIfNumberNotFound() {

		List<Integer> expectedArrayList = Arrays.asList(11, 22, 33, 7, 22);

		replaceArrayElement.replacingArrayElement(55, 88, expectedArrayList);

	}

}
