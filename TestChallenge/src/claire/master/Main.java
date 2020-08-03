package claire.master;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] A = {1,3,4,6,1};
        Arrays.sort(A);

        // create a min variable
        int minNumber = 1;
        for(int i=0; i<A.length; i++) {
            if(A[i] == minNumber) {
                minNumber++;
            }
        }
        System.out.println("The smallest number is " + minNumber);
    }
}
