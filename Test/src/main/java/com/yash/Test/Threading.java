package com.yash.Test;

public class Threading {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
	
}

class MyThread extends Thread {
//	public void start() {
//		super.start();
//		System.out.println("MyThread.start()");
//
//	}

	public void run() {
		System.out.println("MyThread.run()");
	}
}