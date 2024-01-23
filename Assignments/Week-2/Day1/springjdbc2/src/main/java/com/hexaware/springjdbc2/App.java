package com.hexaware.springjdbc2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc2.config.AppConfig;
import com.hexaware.springjdbc2.model.Payment;
import com.hexaware.springjdbc2.service.PaymentServiceImpl;

/**
 * Hello world!
 *
 */
public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentServiceImpl service = context.getBean(PaymentServiceImpl.class);
		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME ***");
			System.out.println("1. INSERT");
			System.out.println("2. ENTER TYPE OF THE PAYMENTS - Offline/Online");
			System.out.println("3. VIEW ALL PAYMENTS");
			System.out.println("4. EXIT");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Payment pay = readData();
				boolean booleanIsInserted = service.createPayment(pay);
				if (booleanIsInserted) {
					System.out.println("Record inserted");
				} else {
					System.out.println("Record is not Inserted.");
				}
				break;
			case 2:
				String type = readType();
				List<Payment> list1 = service.selectPaymentsByPayment_Type(type);
				for (Payment j : list1) {
				    System.out.println(j);
				}
				break;

			case 3:
				List<Payment> list = service.selectAllPayments();
				for (Payment i : list) {
					System.out.println(i);
				}
				break;
			case 4:
				flag = false;
				System.out.println("Thank You, Visit again!");
				break;
			default:
				break;

			}
		}
	}

	public static Payment readData() {
		Payment pay = new Payment();

		System.out.println("Enter Payment ID:");
		pay.setPayment_ID(scanner.nextInt());

		System.out.println("Enter Order ID:");
		pay.setOrder_ID(scanner.nextInt());

		// Enter payment date as string in the format ddMMyyyy
		System.out.println("Enter Payment Date (ddMMyyyy):");
		String dateInput = scanner.next();
		pay.setPayment_date(parseDate(dateInput));

		System.out.println("Enter Amount:");
		pay.setAmount(scanner.nextDouble());

		System.out.println("Enter Payment Type:");
		pay.setPayment_Type(scanner.next());

		System.out.println("Enter Payment Status:");
		pay.setPayment_Status(scanner.next());

		return pay;
	}
	
	private static String readType() {
		    System.out.println("Enter Payment Type:");
		    String type = scanner.next();
		    return type;
		
	}
	

	private static Date parseDate(String dateInput) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		try {
			return dateFormat.parse(dateInput);
		} catch (ParseException e) {
			System.out.println("Invalid date format. Please enter the date in ddMMyyyy format.");
			return null;
		}
	}
}
