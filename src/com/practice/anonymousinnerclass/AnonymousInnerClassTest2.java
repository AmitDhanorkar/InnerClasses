package com.practice.anonymousinnerclass;

public class AnonymousInnerClassTest2 {

	public static void main(String[] args) {
		////Defining a thread by implementing Runnable interface with anonymous inner class
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}

			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}

	}

}
