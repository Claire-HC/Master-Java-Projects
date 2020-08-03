package claire.master;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5};
        reverse(array);

        int[] array2 = {1,4,5,9,11,34,43};
        System.out.println("Array = " + Arrays.toString(array2));
        reversed(array2);
        System.out.println("Reversed array = " + Arrays.toString(array2));
    }

    public static void reverse(int[] array){
        int[] reversed = new int[array.length];
        for(int i=0;i<array.length;i++) {
            reversed[i]=array[i];
        }
        int count=0;
        for (int i= array.length-1; i>=0; i--){
            reversed[count] = array[i];
            count++;
        }
        System.out.println("The reversed array is " + Arrays.toString(reversed));
        System.out.println("The non-reversed array is " + Arrays.toString(array));
    }

    public static void reversed(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i=0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
