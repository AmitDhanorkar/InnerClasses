package com.practice.staticnestedclasses;

public class Outer1 {

	static class Nested1{
		public static void main(String[] args) {
			System.out.println("Static nested class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer class main method");

	}

}
//javac Outer1
//java Outer1
//   O/P :- Outer class main method
//java Outer1$Nested1
//   O/P :- Static nested class main method