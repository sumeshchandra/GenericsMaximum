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
    
    /**
     * As above it'll work the same but having only float values.
     *  numberOne
     *  numberTwo
     *  numberThree
     * @return maxFNumber
     */

    public static Float findFloatMaxNumber(Float numberOne, Float numberTwo, Float numberThree) {
        Float maxFNumber = numberOne;
        if (numberTwo.compareTo(maxFNumber) > 0) {
        	maxFNumber = numberTwo;
        }
        if (numberThree.compareTo(maxFNumber) > 0) {
        	maxFNumber = numberThree;
        }
        return maxFNumber;
    }
    /**
     * String numberOne
     * String numberTwo
     * String numberThree
     * return Maximum of 3 string*/
    
    public static String findMaxofString(String numberOne, String numberTwo, String numberThree) {
    	String maxString = numberOne;
    	if (numberOne.compareTo(maxString) > 0) {
    		maxString = numberTwo;
    	}
    	if (numberThree.compareTo(maxString) > 0) {
    		maxString = numberThree;
    	}
    	return maxString;
    }
    
    public static void main(String[] args) {
		System.out.println(findMaxNumber(123,435,567));
		System.out.println(findFloatMaxNumber(13.4f,34.5f,6f));
		System.out.println(findMaxofString("galaxy", "universe", "world"));
	}
   
}














