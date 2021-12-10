package com.practice.normalinnerclass;

class Test {

	public static void main(String[] args) {
		// Accessing inner class code from outside outer class
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}

}
