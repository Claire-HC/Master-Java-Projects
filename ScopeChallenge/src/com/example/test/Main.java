package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // X x = new X(new Scanner(System.in));
        //x.x();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());

        x.x();
    }
}
