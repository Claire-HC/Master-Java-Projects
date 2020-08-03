package claire.master;

public class Main {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + "KB = " + kiloBytes / 1024 + "MB and "+ kiloBytes % 1024 + " KB");
        }

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if( barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23))){
            System.out.println(barking + "+" + hourOfDay);
            return true;
        } else{
            System.out.println(barking + "+" + hourOfDay);
            return false;
        }
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0 || year % 400 == 0) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999) {
            return -1;
        } else if(isLeapYear(year)) {
            switch (month){
                case 1:
                    System.out.println("31");
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }
        } else {
            switch (month){
                case 1:
                    System.out.println("31-1");
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }

        }
        }


    public static void main(String[] args){
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(5.0);

        printMegaBytesAndKiloBytes(5000);

        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

        getDaysInMonth(1, 2000);
        getDaysInMonth(1, 2001);
    }
}
