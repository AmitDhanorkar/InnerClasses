package com.practice.anonymousinnerclass;


class AnonymousInnerClassTest1 {

	public static void main(String[] args) {
		//Defining a thread by extending thread class with anonymous inner class
		
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
