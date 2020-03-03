package com.yash.spyNumberCheck;

import java.util.function.BiPredicate;
import java.util.logging.Logger;



public class SpyNumber {

	private Logger logger = Logger.getLogger(SpyNumber.class.getName());
	private CustomInputScanner customInputScanner = new CustomInputScanner();

	public boolean isSpyNumber(Integer number) {

		Integer copyOfNumber = number;
		Integer sum = 0, div = 0, product = 1;

		logger.info("Enter number : ");
		number = customInputScanner.getInput();

		BiPredicate<Integer, Integer> checkSpyNumber = (add, prod) -> (add == prod);

		while (copyOfNumber != 0) {
			div = copyOfNumber % 10;
			sum += div;
			product *= div;
			copyOfNumber = copyOfNumber / 10;

		}

		if (checkSpyNumber.test(sum, product)) {
			logger.info(number + "Is Spy Number");
			return true;
		}

		else {
			logger.info(number + "is not Spy number");
			return false;
		}


//		if (sum == product) {
//			logger.info("Is Spy Number");
//			return true;
//		}
//
//		else {
//			logger.info("is not Spy number");
//			return false;
//		}

	}

}
