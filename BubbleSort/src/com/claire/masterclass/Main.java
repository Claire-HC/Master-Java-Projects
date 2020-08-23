package com.claire.masterclass;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = {23, -23, 35, 7, 55, 1, -10};

        for(int lastUnsortedInde = intArray.length - 1; lastUnsortedInde > 0; lastUnsortedInde--){
            for (int i =0; i < lastUnsortedInde; i++) {
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i=0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){

        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
