package com.yash.Test;

class MyInterface {
	int a = 200;

	void eating() {
		a=a+200;
		System.out.println("MyInterface.eating()"+a);
	}

   static class abcd{
	static   void m1() {
		
		   System.out.println("fhsdajhfgh");
	   }
   }
}

class Animal extends MyInterface {

	int a=  200;
	public Animal() {
		//MyInterface.a = 35;
		System.out.println("Animal.Animal() a= "+a);
	}

	@Override
	public void eating() {
		a=+ 400;
		System.out.println("Animal.eating()"+a);
	}
	
//	public int foo(int x , int y) {
//		Integer z ;
//		if(z != null) {
//			z= x+ y;
//		}
//		
//		return z;
//	}

}


public class Check {

	public static void main(String[] args) {
        // MyInterface.abcd.m1();
		MyInterface aa = new Animal();
		aa.eating();
		System.out.println("main a="+aa.a);
	}

}
