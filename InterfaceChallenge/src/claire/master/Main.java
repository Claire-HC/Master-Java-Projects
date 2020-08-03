package claire.master;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player claire = new Player("Claire", 10, 15);
        System.out.println(claire.toString());
        saveObject(claire);

        claire.setHitPoints(17);
        System.out.println(claire);
        claire.setWeapon("Spoon");
        saveObject(claire);
        loadObject(claire);
        System.out.println(claire);

        Saveable wolf = new Monster("Wolf", 9, 18);
        System.out.println(wolf);
        System.out.println("Strength = " + ((Monster) wolf).getStrength()); // cast since wolf object is Interface Saveable instance
        saveObject(wolf);
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(Saveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
