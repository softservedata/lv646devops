package com.softserve.training;

public interface B extends A {
	//void m2();
	
	public default void m2() {
		System.out.println("B");
		//this.m2();
		System.out.println("class = " + this.getClass().getName());
		((A)this).m2();
	}
}
