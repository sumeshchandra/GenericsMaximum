package com.Generics;

public class Maximum {
	  /**
     * here i have created a parameterized constructor having given parameters.
     * First i have taken numberOne is maxNumber
     * then i used compareTo method which will compare with numberTwo..and gradually compare with numberThree also.
     *  numberOne
     *  numberTwo
     *  numberThree
     *  return --> maxNumber
     */
    public static Integer findMaxNumber(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }
    public static void main(String[] args) {
		System.out.println(findMaxNumber(123,435,567));
	}
   
}
