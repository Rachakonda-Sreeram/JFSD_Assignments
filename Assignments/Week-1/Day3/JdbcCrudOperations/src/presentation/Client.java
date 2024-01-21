package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImpl;
import dao.IDeptDao;
import entity.Dept;

public class Client {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		IDeptDao dao = new DeptDaoImpl();

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME DMS ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Dept dept = readData();

				int count = dao.insert(dept);

				System.out.println(count + " record inserted successfully");

				break;
			case 2:

				Dept dept1 = readData();

				int count1 = dao.update(dept1);

				System.out.println(count1 + " Updated inserted successfully");

				break;
			case 3:

				System.out.println("Enter Dno, to delete the record");

				System.out.println("D.No: ");

				int dno = scanner.nextInt();

				int d = dao.deleteOne(dno);

				System.out.println(d + " record deleted");

				break;

			case 4:

				System.out.println("Enter Dno, to view the record");

				System.out.println("D.No: ");

				int no = scanner.nextInt();

				System.out.println(dao.selectOne(no)); 

				break;

			case 5:
				List<Dept> list = dao.selectAll();

				list.stream().forEach(System.out::println);

				break;

			case 6:

				flag = false;
				System.out.println("Thank You, Visit again!");

				break;

			default:
				break;
			}

		}

	}

	public static Dept readData() {

		System.out.println("Enter DNO");

		int dno = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter DNAME");

		String dname = scanner.nextLine();

		System.out.println("Enter LOCATION");

		String location = scanner.nextLine();

		Dept dept = new Dept(dno, dname, location);

		return dept;
	}

}
