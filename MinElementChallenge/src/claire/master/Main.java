package claire.master;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] newArrary = readIntegers(count);
        System.out.println("The minimum element in the array is " + findMin(newArrary));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Please input " + count + " elements: ");
        for(int i=0; i<count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        // int min = Integer.MAX_VALUE;
        for(int i=1; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
