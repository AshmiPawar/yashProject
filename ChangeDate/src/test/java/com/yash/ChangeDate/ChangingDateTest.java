package com.yash.ChangeDate;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ChangingDateTest {

	private ChangingDate changeDate = new ChangingDate();

	@Test
	public void checkDateCurrentDateAfterAddingDays() {

		LocalDate now = LocalDate.now();

		LocalDate expectedAddedValue = now.plusDays(10);

		LocalDate actualDate = changeDate.changingDate(10);

		assertEquals(expectedAddedValue, actualDate);
	}

}
