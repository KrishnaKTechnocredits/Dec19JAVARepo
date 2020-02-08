package poojaRDec19.Assignment4;

import java.util.Scanner;

/*
 * WAP to print the details of Student As Roll No Name and Marks
 * by taking input from theuser.
*/

public class Q2 {

	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter roll no");
		int roll = sc.nextInt();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		System.out.println("name is : " + name);
		System.out.println("roll num is : " + roll);
		System.out.println("marks  : " + marks);

	}

	public static void main(String[] args) {
		Q2 q2 = new Q2();
		q2.input();

	}

}
