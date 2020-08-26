package com.claire.algorithm;

public class InsertionSortMethod {
    int[] intArray = {11, -12, 8, 28, 0, 33};

    public void insertSort(int[] array) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex <= array.length - 1; firstUnsortedIndex++){

            int temp = firstUnsortedIndex;

            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > temp; i--){
                array[i] = array[i - 1];
            }
            array[i] = temp;
        }
    }

}
