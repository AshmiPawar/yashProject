//package com.yash.Test;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//
//
//
class Test{
	public static void main(String[] args)  {

//		factorial();
//		
//		//System.out.println(factorial(5));
////		int a =10;
////		long b = 20;
////		int c = a + b;
//		
//		// Class c =Class.forName("Test"); Test t =(Test)c.newInstance() ;
//		//  System.out.println(Class.forName("String").getName());
		  
	}
	}
//
//	private static void factorial() {
//		throw new RuntimeException();
//		
//		// TODO Auto-generated method stub
////		if(n==1) {
////			return 1;
////		}
////		return n*factorial(n-1);
//		
//		
//		//return null;
//	}
//}
//		//System.out.println(foo("hello world"));
//	
////		String res = merge("hac","ABCDEFGHK");
////		System.out.println(res);
////		
////		List<Integer> list1 = new ArrayList<Integer>();
////		list1.add(40);
////		list1.add(8);
////		list1.add(6);
////		list1.add(22);
////		list1.add(9);
////		list1.add(7);
////		list1.add(50);
////		List<Integer> list = removeSmallerToRight(list1);
////		
////		System.out.println(list);
////	}
////
////	private static List<Integer> removeSmallerToRight(List<Integer> list1) {
////		
////		System.out.println(list1);
////		for (int i = 0; i < list1.size()-1; i++)
////            for (int j = 1; j < list1.size()-i-1; j++)
////                if (list1.get(j) < list1.get(j-1) && list1.get(j) > list1.get(j+1) )
////                {
////                   list1.remove(j+1);
////                   System.out.println(list1);
////                }
////		
////		for (int i = 0; i < list1.size()-1; i++)
////            for (int j = 0; j < list1.size()-i-1; j++)
////                if (list1.get(j) > list1.get(j+1))
////                {
////                   list1.remove(j+1);
////                   System.out.println(list1);
////                }        
////		
////		return list1;
////	}
////
////	private static String merge(String s1, String s2) {
////		StringBuilder result = new StringBuilder(); 
////		  
////        
////        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
////  
////            
////            if (i < s1.length()) 
////                result.append(s1.charAt(i)); 
////  
////            
////            if (i < s2.length()) 
////                result.append(s2.charAt(i)); 
////        } 
////  
////        return result.toString(); 
////		
////		
////		//return null;
////	}
////	
//	
//	
//	
//
////	public static String foo(String str) {
////		if((null== str)|| (str.length() <=1)) {
////			return str;
////		}
////		char[] chars= str.toCharArray();
////		int right = chars.length-1;
////		for(int left =0 ; left < right; left++) {
////			char swap = chars[left];
////			chars[left]= chars[right];
////			chars[right--]=swap;
////			
////
////		}
////		return new String(chars);
////	}
////}
//
////public class Test {
////private int count=1;
////public synchronized void doSoething() {
////	for (int i = 0; i < 10; i++) {
////		System.out.println(count++);
////	}
////}
////public static void main(String[] args) {
////	Test run = new Test();
////	Thread t1=new Example(run);
////	Thread t2=new Example(run);
////	t1.start();
////	t2.start();
////}
////}
////
////class Example extends Thread {
////	Test demo;
////	public Example(Test t) {
////		demo = t;
////	}
////	public void run() {
////		demo.doSoething();
////	}
////}
