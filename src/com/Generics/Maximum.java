package com.Generics;

public class Maximum<T extends Comparable<T>> {
	T[] inputArray;

	/**
	 * here i have used Generic Class. here T is the type of data. Gradually it will
	 * return the max value. firstValue secondValue thirdValue <T> Generic has Type
	 * that extends Comparable, with a parameter constructor.
	 * 
	 * @return maxValue
	 */
	public Maximum(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public T getMaximum() {
		return Maximum.getMaximum(inputArray);
	}

	public static <T extends Comparable<T>> T getMaximum(T[] inputArray) {
		T maxValue = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			T element = inputArray[i];
			if (element.compareTo(maxValue) > 0) {
				maxValue = element;
			}
		}
		return maxValue;

	}

	public static void main(String[] args) {
		Integer[] intArray = { 10, 30, 50, 40, 60, 20 };
		Float[] floatArray = { 10.5f, 23.4f, 35.7f, 47.2f };
		String[] stringArray = { "apple", "banana", "cherry", "pear", "orange" };
		System.out.println(new Maximum(intArray).getMaximum());
		System.out.println(new Maximum(floatArray).getMaximum());
		System.out.println(new Maximum(stringArray).getMaximum());
	}

}
