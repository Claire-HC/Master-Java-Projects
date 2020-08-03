package claire.master;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =  new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(count < 10) {
            System.out.println("Enter number #" + (count+1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of 10 numbers is " + sum);
        scanner.close();
    }
}
