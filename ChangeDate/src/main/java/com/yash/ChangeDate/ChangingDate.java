package com.yash.ChangeDate;

import java.time.LocalDate;

public class ChangingDate {

	public LocalDate changingDate(Integer noOfDays) {
                LocalDate now = LocalDate.now();
				
				System.out.println("Current date : " + (now) );
				
				LocalDate added = now.plusDays(noOfDays);
				
				System.out.println("Added date : " +added );
				
		       return added;

	}
	
}
