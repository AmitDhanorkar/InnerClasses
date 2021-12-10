package com.practice.staticnestedclasses;

public class Outer2 {

	int x = 10;
	static int y = 20;
	
	static class Nested2{
		public void m1() {
			//System.out.println(x); //Compile Error : Cannot make a static reference to the non-static field x
			System.out.println(y);
		}
	}
}
