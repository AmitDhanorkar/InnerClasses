package com.practice.staticnestedclasses;

public class Outer {

	static class Nested {
		public void m1() {
			System.out.println("static nested class method");
		}
	}
	public static void main(String[] args) {
		// Outer.Nested t = new Outer.Nested();
		//or
		Nested t = new Nested();
		t.m1();

	}

}
