package com.yash.FindWrongNumber;

import java.util.List;
import java.util.function.BiPredicate;

public class FindWorngNumber {

	public Integer findingwrongNumber(List<Integer> numberList) {
		BiPredicate<Integer, Integer> isSumTen = (number1, number2) -> (number1 + 10) == number2;

		BiPredicate<Integer, Integer> isSumFive = (number1, number2) -> (number1 + 5) == number2;

		Integer wrongNumber = 0;
		for (Integer i = 0, j = 1; i < numberList.size(); i = i + 2, j = j + 2) {
			if (i + 2 < numberList.size() && isSumFive.negate().test(numberList.get(i), numberList.get(i + 2))) {
				wrongNumber = numberList.get(i + 2);
				break;

			}
 
			if (j + 2 < numberList.size() && isSumTen.negate().test(numberList.get(j), numberList.get(j + 2))) {
				wrongNumber = numberList.get(j + 2);
				break;
			}

		}
		return wrongNumber;
	}

}
