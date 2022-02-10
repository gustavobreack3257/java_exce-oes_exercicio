package aplication;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.exceptions.AccountException;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		try {
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
		
		System.out.print("Enter amount for withdraw: ");
		Double saque = sc.nextDouble();
		account.withdraw(saque);
		}
		catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
