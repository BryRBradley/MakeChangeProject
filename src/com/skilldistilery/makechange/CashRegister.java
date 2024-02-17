package com.skilldistilery.makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		double price = 0;
		double cash = 0;
		System.out.println("Would you like to use the cash register?");
		System.out.println();
		System.out.println("Please enter Y/N to continue: ");
		Scanner kb = new Scanner(System.in);
		String yN = kb.nextLine(); 
		do {
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
				continue;
			} else if (cash < price) {
				System.out.println("Not enough cash tendered");
				continue;
			}
				else if(cash > price) {

			
				double change = cash - price;

				double changeDue = (double) (change * 100);

				double dollars = changeDue / 100;
				changeDue = changeDue % 100;

				double quarters = changeDue / 25;
				changeDue = changeDue % 25;

				double dimes = changeDue / 10;
				changeDue = changeDue % 10;

				double nickles = changeDue / 5;
				changeDue = changeDue % 5;

				double pennies = changeDue;
				System.out.println("Give the customer: ");
				System.out.println(Math.floor(dollars) + " Dollars");
				System.out.println(Math.floor(quarters) + " Quarters");
				System.out.println(Math.floor(dimes) + " Dimes");
				System.out.println(Math.floor(nickles) + " Nickles");
				System.out.println(Math.round(pennies) + " Pennies");
				continue;
			} 
			}while(yN.equals("y"));
			kb.close();
		
			}
		}