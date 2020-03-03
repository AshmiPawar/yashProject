package com.yash.Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
//public class Majisco implements Serializable{
//	private Tree tree;
//	public static void main(String[] args) {
//		Majisco p = new Majisco();
//     		try {
//     			FileOutputStream f = new FileOutputStream("");
//     			ObjectOutputStream o = new ObjectOutputStream(f);
//     			o.writeObject(f);
//     		}
//     		catch (Exception e) {
//     			e.printStackTrace();
//     		}
//	
//}
//}
//class Tree {
//	
//}
//public class Majisco{
//	
//	
//	public static void main(String[] args) {
//		Random random =  new Random();
//		random.ints().limit(15).sorted().forEach(System.out::println);
//	}
//}

//public class Majisco{
//
//	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
//		Integer itr1 = 40;
//		Integer itr2 = 50;
//		set.add(itr1);
//		set.add(itr1);
//		set.add(itr2);
//		set.remove(itr1);
//		itr2= 47;
//		set.remove(itr2);
//		System.out.println(set.size());
//	}
//}


//class A { }
//class B extends A{}
//class C extends B{}
//
//
//
//
//public class Majisco{
//
//	public static void main(String[] args) {
//	ArrayList<A> x = new ArrayList<A>();	
//	ArrayList<B> a = new ArrayList<B>();
//	
//	x.add(new A());
//	a = (ArrayList<B>)x;
//	
//	
//	}
//	
//}


//public class Majisco<E>{
//
//	public static <E> void append(List<E> list) {
//		E elem = new E();
//		list.add(elem);
//		System.out.println(list);
//	
//}
//	public static void main(String[] args) {
//	Majisco.append(Arrays.asList("one","two"));
//	}
//}
//public class Majisco{
//	
// public static void m1() {
//	 System.out.println("Majisco.m1()");
//	
//}
//}
//class Hi extends Majisco{
	

//public class Majisco{
//
//	public static void main(String[] args) {
//		try {
//			int a[] = new int[1];
//			a[1] = 30/0;
//			a[2] = 50;
//	}
//    catch(ArithmeticException e) {
//    	System.out.println("A");
//    }
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("B");
//		}
// 
//		 System.out.println("rest");
//}


public class Majisco {
Integer id;

public Majisco(int i) {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

//@Override
public boolean equals(Majisco obj) {
	Majisco other = (Majisco) obj;
	boolean ret = false;
	
	if(other.equals(this.id)) {
		ret =  true;
	}
	
	return ret;
}

@Override
public String toString() {
	return "Majisco [id=" + id + "]";
}

	public static void main(String[] args) {
		Majisco t1 = new Majisco(1);
		Majisco t2 = new Majisco(1);
		
		Map m = new HashMap();
		
		m.put(t1, 1);
		m.put(t2, 1);
		
		System.out.println(m.size());
		
		
		
	}
}	//	public static void main(String[] args) {
//     Object o = new Object();
//     
//    // Set s = new HashSet();
//     LinkedHashSet s = new LinkedHashSet();
//     s.add("o");
//     s.add(o);
//	
//     System.out.println(s);
//	}

//}
