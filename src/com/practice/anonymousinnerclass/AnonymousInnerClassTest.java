package com.practice.anonymousinnerclass;

class AnonymousInnerClassTest {

	public static void main(String[] args) {
		//creating anonymous inner class that extends class
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		p.taste();

		Popcorn p1 = new Popcorn();
		p1.taste();
		
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p2.taste();
		
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
	}

}
