package com.yash.demo.model;

import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class EmployeeTest {

	@Test
	public void shouldCheckEqualsHashCodeInEmployee() {
		EqualsVerifier.forClass(Employee.class).suppress(Warning.NONFINAL_FIELDS).usingGetClass().verify();
	}

}
