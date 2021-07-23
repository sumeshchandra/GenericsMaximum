package com.Generics;

public class Maximum {
	/**
     * here i have used Generic functions.
     * here E is the type of data.
     * Gradually it will return the max value.
     *  firstValue
     *  secondValue
     *  thirdValue
     *  <E>
     * @return maxValue
     */
    public static <E extends Comparable<E>> E findMax(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
		System.out.println(findMax(123,435,567));
		System.out.println(findMax(13.4f,34.5f,6f));
		System.out.println(findMax("galaxy", "universe", "world"));
	}
   
}














