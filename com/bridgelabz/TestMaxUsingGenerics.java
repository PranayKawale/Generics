package com.bridgelabz;

public class TestMaxUsingGenerics {

	public static void main(String[] args) {
		Integer a = 5;
		Integer b =6;
		Integer c = 8;

		System.out.println(getMax(a,b,c));
	}

	public static <T extends Comparable> T getMax(T a, T b, T c) {

		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;
	}
}


