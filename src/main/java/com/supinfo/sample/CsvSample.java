package com.supinfo.sample;

import java.util.Scanner;

public class CsvSample {

	private static Scanner scanner;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\nNomenclature client menu : ");
			System.out.println("\t1. Show All");
			System.out.println("\t2. Filter By univers");
			System.out.println("\t3. Find by id\n");
			System.out.println("\t4. Exit\n");

			System.out.print("Enter your choice (1, 2, 3 or 4) : ");
			String choice = scanner.next();
			System.out.println();

			switch (choice) {
				case "1":
					showAll();
					break;
				case "2":
					FilterByUnivers();
					break;
				case "3":
					findById();
					break;
				case "4":
					System.out.println("Bye.");
					System.exit(1);
				default:
					System.out.println("Invalid choice, please try again.");
					break;
			}
		}

	}

	private static void findById() {

	}

	private static void FilterByUnivers() {

	}

	private static void showAll() {

	}

}
