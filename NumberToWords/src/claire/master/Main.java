package claire.master;

public class Main {

    public static void main(String[] args) {
            // write your code here
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(reverse(123)));
        System.out.println(reverse(0));
        numberToWords(100);
        numberToWords(0);

        //numberToWords(12);
    }

    public static void numberToWords(int number1){
        if(number1 < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNum = reverse(number1);
        int original = reverseNum;

        if (reverseNum == 0) {
            System.out.println("Zero");
        }
        while(reverseNum > 0) {
            int digit = reverseNum % 10;

            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNum /= 10;
        }

        if(getDigitCount(number1) != getDigitCount(original)) {
            for (int i = 0; i < (getDigitCount(number1) - getDigitCount(original)); i++) {
                System.out.println("Zero");
            }
        }
    }


    public static int getDigitCount(int number){
        int count = 0;

        if (number < 0)
            return -1;

        if(number < 10)
            return 1;

        while(number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }


    public static int reverse(int number2) {
        int one = number2;
        int reverseNumber = 0;
        while(Math.abs(number2) > 0) {
            int digit = Math.abs(number2) % 10;
            reverseNumber = 10 * reverseNumber + digit;
            number2 /= 10;
        }

        if(one < 0) {
            return -reverseNumber;
        }
        return reverseNumber;
    }
}
