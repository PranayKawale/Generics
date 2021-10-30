package com.bridgelabz;

public class TestMaxUsingGenerics {

	public static void main(String[] args) {
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";

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


