package com.bridgelabz;

public class TestMaxUsingGenerics {

	public static void main(String[] args) {
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		Integer x = 5;
		Integer y =6;
		Integer z = 8;
		Float m = 5.6f;
		Float n = 6.8f;
		Float j = 8.7f;


		System.out.println(getMax(a,b,c));
		System.out.println(getMax(x,y,z));
		System.out.println(getMax(m,n,j));
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


