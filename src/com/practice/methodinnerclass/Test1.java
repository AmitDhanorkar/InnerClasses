package com.practice.methodinnerclass;

class Test1 {

	int x = 10;
	static int y = 20;
	public void m1() {

		class Inner {
			public void m2() {
				System.out.println(x); //if m1() method is static method then variable x(class level variable) not accessible inside inner class. 
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
	}
}
