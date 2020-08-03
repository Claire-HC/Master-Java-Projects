package claire.master;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //printArray(getIntegers());
        printArray(sortIntegers(getIntegers()));

    }

    public static int[] getIntegers(){
        int[] array = new int[5];
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] array){
        //int[] newArray = new int[array.length];
       /* for(int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }*/
        // copy an array
        int[] newArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i=0; i<newArray.length-1; i++){
                if(newArray[i] < newArray[i++]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return newArray;
    }
}
