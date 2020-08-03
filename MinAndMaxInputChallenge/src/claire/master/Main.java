package claire.master;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int count = 0;

        while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                if(count == 0) {
                    min = number;
                    max = number;
                    count++;
                }
                else if(number < min) {
                    min = number;
                    //count++;
                    //System.out.println(count);
                } else if(number > max){
                    max = number;
                    //1count++;
                    //System.out.println(count);
                }
                scanner.nextLine();
            }
            else{
                break;
            }
        }

        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);
        scanner.close();
    }
}
