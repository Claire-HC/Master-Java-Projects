package com.claire.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {11, -15, 23, 5, 0, -1};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex <= intArray.length - 1; firstUnsortedIndex++){
            int temp = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > temp; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = temp;

        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
