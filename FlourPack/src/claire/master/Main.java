package claire.master;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));

        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 10, 18));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack ( int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if((bigCount * 5 + smallCount) >= goal) {
            if(smallCount == 0 && goal % 5 != 0){
                return false;
            } else if(bigCount > smallCount && goal % 5 > smallCount){
                return false;
            }else return true;
        } else {
            return false;
        }
    }
}
