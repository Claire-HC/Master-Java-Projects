package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(getLargestPrime(217));
        //System.out.println(getLargestPrime(21));
        //System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        //System.out.println(getLargestPrime(-1));
        System.out.println(largePrimeFactor(45));
    }


    public static int getLargestPrime(int number){
        if(number <= 1) {
            return -1;
        }

        int i = 0;

        for(i = 2; i <= number; i++) {
            if(number % i == 0) {
                number /= i;
                i--;
                System.out.println(i);
            }
        }
        return i;
    }

    public static int largePrimeFactor(int n){
        int div = 2;
        while(div < n) {
            if(n % div != 0) {
                div++;
            }else {
                n = n / div;
                div = 2;
            }
        }
        return n;
    }
}
