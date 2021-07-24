package com.Generics;

public class Maximum<T extends Comparable<T>> {
	T firstValue, secondValue, thirdValue;

	/**
	 * here i have used Generic Class. here T is the type of data. Gradually it
	 * will return the max value. firstValue secondValue thirdValue <T>
	 * Generic has Type that extends Comparable, with a parameter constructor.
	 * 
	 * @return maxValue
	 */
	public Maximum(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public T getMaximum() {
		return Maximum.getMaximum(firstValue, secondValue, thirdValue);
	}

	public static <T extends Comparable<T>> T getMaximum(T firstValue, T secondValue, T thirdValue) {
		T maxValue = firstValue;
		if (secondValue.compareTo(maxValue) > 0) {
			maxValue = secondValue;
		}
		if (thirdValue.compareTo(maxValue) > 0) {
			maxValue = thirdValue;
		}
		return maxValue;
	}

	public static void main(String[] args) {
		System.out.println(getMaximum(123, 435, 567));
		System.out.println(getMaximum(13.4f, 34.5f, 60.5f));
		System.out.println(getMaximum("galaxy", "universe", "world"));
	}

}
