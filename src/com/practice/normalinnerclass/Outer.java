package com.practice.normalinnerclass;

class Outer {

	int x = 10;
	int z = 30;
	static int y = 20;
	
	class Inner {

		/*
		 * we can't declare static member inside inner classed hence we can't declare main() method
		 * Compile error : inner class can't have static declaration
		 * */
		//public static void main(String[] args) {
		//	System.out.println("Outer class main method"); 
		//}
		
		int z = 100;
		public void m1() {
			System.out.println("Inner class method");
		}

		public void m2() {
			System.out.println("Non static member of outer class x : "+x); //accessing non static member of outer class
			System.out.println("static member of outer class y : "+y); //accessing static member of outer class
		}

		public void m3() {
			int z = 1000;
			System.out.println("Inner class m3() Method variable z : "+z); //accessing inner class method m1() variable inside inner class
			System.out.println("Innerc lass level variable z : "+this.z); //accessing inner class level variable inside inner class method
			System.out.println("Outer class variable z : "+Outer.this.z); //accessing outer class variable inside inner class method
		}
	}

	public void m4() {
		System.out.println("Outer class instance method");
		Inner i = new Inner();
		i.m1(); //Accessing inner class code from instance area of outer class
	}

	public static void main(String[] args) {
		System.out.println("Outer class main method");

		//Accessing inner class code from static area of outer class
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();  
		// or Outer.Inner i = new Outer().new Inner();
		// or new Outer().new Inner().m1();
		i.m1();

		//Accessing inner class code from instance area of outer class
		o.m4();
		
		new Outer().new Inner().m2();
		new Outer().new Inner().m3();

	}

}
