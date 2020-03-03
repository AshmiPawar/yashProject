package com.yash.Test;

import java.util.ArrayList;
import java.util.List;

public class LogicMonitor {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		//System.out.println("x = "+x);
		String str = "abcdef";
		char[] arr = str.toCharArray();
		System.out.println(arr);
		String s = String.valueOf(arr);
		if(str.length()%2 != 0) {
			System.out.println(str.charAt(str.length()/2));
		}
		else {
			 
			System.out.println(
					String.valueOf(((str.charAt(str.length()/2 -1)))  
					+
					String.valueOf(str.charAt(str.length()/2 )))
					
					);
		}
		
		splitInteger(20,6);
		//test.abcd.m1();
		
	}
	
	 public static List<Integer> splitInteger( Integer num,Integer parts ) {
		    List<Integer> res = new ArrayList<Integer>();
		    System.out.println("num%parts = "+num%parts);
		    if (num % parts == 0) 
		    { 
		    	System.out.println("in if 1");
		        for(int i=0;i<parts;i++) {
		        System.out.print((num/parts)+" "); 
		        }
		    } 
		    else
		    { 
		        int zp = parts - (num % parts); 
		        System.out.println("zp = "+zp);
		        int pp = num/parts; 
		        System.out.println("pp = "+pp);
		        for(int i=0;i<parts;i++)  
		        { 
		        	System.out.println("for i = "+ i);
		        	
		        	
		            if(i>= zp) {
		                System.out.println("in if 2 i ="+i+"pp+1  = "+(pp+1));
		            	System.out.print((pp + 1)+" "); 
		            }
		            else 
		            {
		            	System.out.println("in else pp = "+pp);
		            System.out.print(pp+" ");
		            }
		        } 
		    } 
		    return res;
		  }
}
//
//public static Integer cyclicString( String str ) {
//    for (int i = 1;i<=str.length();i++) {
//        String part = str.substring(0,i);
//        boolean isRoot = true;
//        for (int j = 0;j<str.length();j++) {
//            char[] strArray = str.toCharArray();
//            char[] partArray = part.toCharArray();
//            if (strArray[j] != partArray[j % partArray.length]) {
//                isRoot = false;
//                break;
//            }
//        }
//        if (isRoot) {
//            return i;
//        }
//    }
//    return 0;


abstract class test{
	static class abcd{
		 static void m1() {
			System.out.println("inner class");
		}
	}
}























