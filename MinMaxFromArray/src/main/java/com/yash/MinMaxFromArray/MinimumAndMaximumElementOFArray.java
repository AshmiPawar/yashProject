package com.yash.MinMaxFromArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumAndMaximumElementOFArray { 

	public List<Integer> findMinimumAndMaximumElementOfArray(Integer[] list) {
		
		List<Integer> listOfMinMax = new ArrayList<Integer>();
		
		listOfMinMax.add(Arrays.stream(list).min(Integer::compare).get());
		listOfMinMax.add(Arrays.stream(list).max(Integer::compare).get());
		
		return listOfMinMax;
	}
}
