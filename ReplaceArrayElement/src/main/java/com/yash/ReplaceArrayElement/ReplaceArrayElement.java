package com.yash.ReplaceArrayElement;

import java.util.List;

public class ReplaceArrayElement {

	public List<Integer> replacingArrayElement(Integer listElement, Integer replacement, List<Integer> list) {

		System.out.println(list);
		if (list.contains(listElement)) {
			Integer index = list.indexOf(listElement);
			list.set(index, replacement);
		}

		else 
			throw new NumberNotFoundInListException("number not in list");


		return list;
	}

}
