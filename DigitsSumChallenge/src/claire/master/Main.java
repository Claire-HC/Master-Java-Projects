package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of digits: " + sumDigits(125));
        System.out.println(isPalindrome(11));
    }

    public static int sumDigits(int number) {

        // The number must be larger than 10, otherwise return -1
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            // find the least important digit
            int digit = number % 10;

            // sum digits
            sum += digit;

            // drop the least important digit
            number /= 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int currentNumber = Math.abs(number);

        while(currentNumber > 0) {
            int lastDigit = currentNumber % 10;
            reverse = reverse * 10 + lastDigit;
            currentNumber /= 10;
        }

        if(reverse == Math.abs(number)) {
            return true;
        } else {
            return false;
        }
    }
}
