package com.skilldistilery.makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		double price = 0;
		double cash = 0;

		Scanner kb = new Scanner(System.in);

		do {
			System.out.println("Would you like to make a transaction? Enter Y/N ");
			String yN = kb.next();
			if (yN.equals("N") || yN.equals("n")) {
				System.out.println("Have a nice day");
				break;
			}
			System.out.println("Cash_POS is ready for transactions");
			System.out.println();
			System.out.println("Please enter item price with a decimal: ");
			price = kb.nextDouble();
			System.out.println();
			System.out.println("Please enter the amount of cash tenderd: ");
			cash = kb.nextDouble();
			System.out.println("The price is: " + price + "  Cash tendered is: " + cash);

			if (cash == price) {
				System.out.println("That is the exact amount, No change");

			}

			else if (cash < price) {
				System.out.println("Not enough cash tendered");

			}

			else if (cash > price) {

				double change = cash - price;

				double changeDue = change * 100;

				double hundreds = changeDue / 10000;
				changeDue = changeDue % 10000;

				double fifties = changeDue / 5000;
				changeDue = changeDue % 5000;

				double twenties = changeDue / 2000;
				changeDue = changeDue % 2000;

				double tens = changeDue / 1000;
				changeDue = changeDue % 1000;

				double dollars = changeDue / 100;
				changeDue = changeDue % 100;

				double quarters = changeDue / 25;
				changeDue = changeDue % 25;

				double dimes = changeDue / 10;
				changeDue = changeDue % 10;

				double nickles = changeDue / 5;
				changeDue = changeDue % 5;

				double pennies = changeDue;

				System.out.println("The change is : " + change);

				if (hundreds >= 1) {
					System.out.println(Math.floor(hundreds) + "Hundreds");
				}
				if (fifties >= 1) {
					System.out.println(Math.floor(fifties) + "Fifties");
				}
				if (twenties >= 1) {
					System.out.println(Math.floor(twenties) + " Twenties");
				}

				if (tens >= 1) {
					System.out.println(Math.round(tens) + " Tens");
				}
				if (dollars <= 9 && dollars > 1) {
					System.out.println(Math.round(dollars) + " Dollars");
				}
				if (quarters >= 1) {
					System.out.println(Math.round(quarters) + " Quarters");
				}

				if (dimes >= 1) {
					System.out.println(Math.floor(dimes) + " Dimes");
				}
				if (nickles >= 1)
					System.out.println(Math.floor(nickles) + " Nickles");

				if (pennies >= 1)
					System.out.println(Math.round(pennies) + " Pennies");

			}
		} while (true);

	}
}
