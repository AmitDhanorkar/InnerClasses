package com.practice.methodinnerclass;

class Test3 {

	int x = 10;
	
	public void m1() {
		final int y = 20;
		
		class Inner {
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.m1();
	}

}
