package com.yash.CapitaliseString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CapitaliseStringTest {

	private CapitaliseString captaliseString = new CapitaliseString();

	@Test
	public void shouldCapitaliseFirstAndLastLetterOfString() {

		String expectedString = "YasH PunE OfficE ";

		String actualString = captaliseString.capitaliseStringLetters("yash pune office");

		assertEquals(expectedString, actualString);

	}

	@Test
	public void shouldCapitaliseStringIfItContainsOneLetter() {

		String expectedString = "YasH A OfficE ";

		String actualString = captaliseString.capitaliseStringLetters("yash a office");

		assertEquals(expectedString, actualString);

	}
}
