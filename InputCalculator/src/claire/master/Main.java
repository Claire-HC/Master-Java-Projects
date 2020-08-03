package claire.master;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int average = 0;
        double count = 0;

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                double number = scanner.nextInt();
                sum += number;
                count++;
            } else if(count == 0) {
                System.out.println("SUM = 0 AVG = 0");
                break;
            }else {
                average = (int)Math.round(sum / count);
                System.out.println(sum);
                System.out.println(count);
                System.out.println("SUM = " + (int)sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
    }
}
