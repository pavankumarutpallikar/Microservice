package com.ltimindtree.test;

public class Test {

	public int sum(int a, int b) {
		System.out.println("int type data is executed.......");
		return a + b;
	}

	public Long sum(long a, long b) {
		System.out.println("Long type data is executed.......");
		return a + b;
	}

	public static void main(String[] args) {
		Test obj1 = new Test();
		obj1.sum(100000l, 1000000l);
	}

}
