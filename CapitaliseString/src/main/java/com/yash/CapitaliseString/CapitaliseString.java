package com.yash.CapitaliseString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapitaliseString {

	public String capitaliseStringLetters(String str) {

		String newString = "";
		Function<String, String> func = (word) -> {

			if (word.length() == 1)
				return word.toUpperCase();
			else {
				String firstLetter = word.substring(0, 1);
				String middleLetters = word.substring(1, word.length() - 1);
				String lastLetter = word.substring((word.length() - 1), (word.length()));
				String newWord = firstLetter.toUpperCase() + middleLetters + lastLetter.toUpperCase();
				return newWord;
			}
		};
	 
		 List<String> newstringList = Arrays.stream(str.split(" ")).map(words -> func.apply(words)).collect(Collectors.toList());
		 for(String str1:newstringList){
        	 newString = newString + str1 + " ";
         }
		
		return newString;
	}
}
