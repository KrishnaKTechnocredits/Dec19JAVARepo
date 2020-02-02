package chaitanyaKDec19.assignment4_JavaBasicPrograms;

/*
 * WAP to print the details of Student As Roll No Name and Marks by taking input from theuser
 */

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting student name from the user
		System.out.println("Please enter name of the student: ");
		String name = scanner.nextLine();

		// Accepting roll number of the student from user
		System.out.println("Please enter roll number of the student: ");
		int rollNum = scanner.nextInt();

		// Accepting marks of the student from user
		System.out.println("Please enter marks of the student: ");
		double marks = scanner.nextDouble();

		scanner.close();

		// Calling method to display student details
		displayStudentDetails(name, rollNum, marks);

	}

	static void displayStudentDetails(String inputName, int inputRollNum, double inputMarks) {

		System.out.println("Name of the student is: " + inputName);
		System.out.println("Roll number of the student is: " + inputRollNum);
		System.out.println("Marks obtained by the said students are: " + inputMarks);

	}

}
