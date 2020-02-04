package sonalPDec19.assignment4.javaBasicsProgram;

import java.util.Scanner;

/*
 * WAP to print the details of Student As Roll No Name and 
 * Marks by taking input from the user
 */

public class Q2StudentDetails {

	static void printStudentDetails(String sName, int sRollNo, int sMarks) {
		System.out.println("Name of student: " + sName);
		System.out.println("Roll no: " + sRollNo);
		System.out.println("Marks: " + sMarks);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of student: ");
		String name = s.nextLine();
		System.out.println("Enter roll no of student: ");
		int rollNo = s.nextInt();
		System.out.println("Enter marks: ");
		int marks = s.nextInt();
		printStudentDetails(name, rollNo, marks);
	}
}
