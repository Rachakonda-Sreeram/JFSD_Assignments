package abstraction;

import java.util.Scanner;

public class AtmUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBank bank = new BankImp2();
		System.out.println("****WELCOME TO BANK****");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
	
		while (flag) {
			
			System.out.println("ENTER 1 TO DEPOSIT");
			System.out.println("ENTER 2 TO WITHDRAWL");
			System.out.println("ENTER 3 TO EXIT");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				bank.deposit();
				break;
			case 2:
				bank.withdrawl();
				break;
				
			case 3:
				flag = false;
				System.out.println("Thank You!!");
				break;
			default:
				System.out.println("Enter Correct Input");
				break;
				

			}

		}
	}
}
