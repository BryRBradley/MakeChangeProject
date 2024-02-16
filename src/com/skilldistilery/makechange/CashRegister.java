package com.skilldistilery.makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		double price = 0;
		double cash = 0;
		double change = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to use the cash register?");
		System.out.println( "Please enter Y/N to continue: ");
		String yN = kb.next();
		while (yN.equals("Y")) {
		kb.nextLine();
		System.out.println("Cash_POS is ready for transactions");
		System.out.println("Please enter item price with a decial: ");
		price = kb.nextDouble();
		System.out.println();
		System.out.println("Please enter the amount of cash tenderd: ");
		cash = kb.nextDouble();
		System.out.println("The price is: " + price + "  Cash tendered is: " + cash);
		if (cash == price) {
			System.out.println("That is the exact amount");
		} else if (cash < price) {
			System.out.println("Not enough cash tendered");
		
			}
		}
	}
}
