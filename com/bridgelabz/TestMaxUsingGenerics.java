package com.bridgelabz;

public class TestMaxUsingGenerics<T extends Comparable <T>>  {
	T x, y, z;
	
	public TestMaxUsingGenerics(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) {
		TestMaxUsingGenerics max1 = new TestMaxUsingGenerics<Integer>(5,6,8);
		TestMaxUsingGenerics max2 = new TestMaxUsingGenerics<Float>(5.6f,6.8f,8.7f);
		TestMaxUsingGenerics max3 = new TestMaxUsingGenerics<String>("Apple", "Peach", "Banana");
	

		System.out.println(max1.testMax());
		System.out.println(max2.testMax());
		System.out.println(max3.testMax());
	}

	public <T extends Comparable> T testMax() {

		if (x.compareTo(y) > 0 && x.compareTo(z) > 0)
			return (T) x;
		else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
			return (T) y;
		else
			return (T) z;
	}
}


