package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Lead;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Lead> list = new ArrayList<>();
		char answer;
		int i = 0;

		while (i != 1) {

			do {

				System.out.println("Please incert your information for contact:");
				System.out.println();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				System.out.print("Phone Number: ");
				int phoneNumber = sc.nextInt();
				list.add(new Lead(name, email, phoneNumber));

				System.out.print("Do you want to see the Leads list?  (Y/N): ");
				answer = sc.next().charAt(0);
				sc.nextLine();

				System.out.println();

			} while (answer != 'Y');

			System.out.println();
			System.out.println(list + "\n");

			System.out.print("Would you like to filter any leads? (Y/N): ");
			char answer2 = sc.next().charAt(0);

			if (answer2 == 'Y') {
				System.out.print("By Name (N), E-mail (E) or Phone Number (P) ?: ");
				char answer3 = sc.next().charAt(0);

				if (answer3 == 'N') {
					System.out.print("Incert the name: ");
					String name2 = sc.nextLine();
					sc.nextLine();

					List<Lead> result = list.stream().filter(lead -> lead.getName() == name2)
							.collect(Collectors.toList());
					for (Lead lead : result) {
						System.out.println("By name: " + lead);
					}
				}

				System.out.println();

			}
		}
		sc.close();
	}
}