package com.softserve.training;

public interface A {
	public default void m1() {
		System.out.println("A");
		m2();
	}

	public default void m2() {
		System.out.println("A");
	}
}
