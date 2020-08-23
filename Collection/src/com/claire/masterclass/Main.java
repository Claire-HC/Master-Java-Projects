package com.claire.masterclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater theater = new Theater("Olympian", 8, 12);
        theater.getSeats();
        if(theater.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, the seat is taken");
        }

    }
}
