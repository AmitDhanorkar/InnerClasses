package com.practice.anonymousinnerclass;

public class AnonymousInnerClassTest3 {

	public static void main(String[] args) {
		// Anonymous Inner Class that define method argument

		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread");
				}
			}
		}).start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
