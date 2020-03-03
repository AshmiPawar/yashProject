package com.yash.NextNumber;

import java.util.function.Function;

public class NextNumber {

	public Integer findNextNumber(Integer[] list) {
	   
	   Function<Integer[],Integer> func = (numberList -> {
		   Integer value = 0;
		   for(Integer i=0;i<list.length;i++) {
			   if(i%2==0)
				   value = list[i] + 3;
			   else
				   value = list[i] - 2;
		   }
			
			return value;
	   });
	   
		return func.apply(list);
	}

}
