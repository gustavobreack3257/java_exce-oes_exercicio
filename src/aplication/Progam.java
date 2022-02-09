package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dados da conta:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		Double saque = sc.nextDouble();
		
		sc.close();
	}

}
