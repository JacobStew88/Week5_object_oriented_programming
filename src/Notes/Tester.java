package Notes;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = kb.next();
		System.out.println("How much to deposit?");
		double deposit = kb.nextDouble();
		
		BankAccount acct1 = new BankAccount();

		BankAccount acct2 = new BankAccount(name, deposit);
		BankAccount acct3 = new BusinessAccount(name, deposit, 2.5);
		System.out.println(acct2.getName());
		System.out.println(acct2.getBalance());
		
		acct2.setName("Micky");
		acct2.setBalance(7889);
		
		System.out.println(acct2.getName());
		System.out.println(acct2.getBalance());
		System.out.println(acct3.getName());
		System.out.println(acct3.getBalance());
	}

}
