package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	Lamp lamp1 = new Lamp("lamp 1");
	Lamp lamp2 = new Lamp("lamp 2");
	Lamp lamp3 = new Lamp("lamp 3");
	Lamp lamp4 = new Lamp("lamp 4");
	Lamp lamp5 = new Lamp("lamp 5");
	Lamp selectedLamp = null;

	while ( true ) {
		System.out.println(lamp1);
		System.out.println(lamp2);
		System.out.println(lamp3);
		System.out.println(lamp4);
		System.out.println(lamp5);

		System.out.println("\nPlease pick and write a number from 1 to 5, for the lamp you want to turn on/off:");
		int userInput = scanner.nextInt();
		if (userInput == 1) {
			selectedLamp = lamp1;
		} else if (userInput == 2) {
			selectedLamp = lamp2;
		} else if (userInput == 3) {
			selectedLamp = lamp3;
		} else if (userInput == 4) {
			selectedLamp = lamp4;
		} else if (userInput == 5) {
			selectedLamp = lamp5;
		}
		selectedLamp.trykPåKontakt();
	}
    }
}
