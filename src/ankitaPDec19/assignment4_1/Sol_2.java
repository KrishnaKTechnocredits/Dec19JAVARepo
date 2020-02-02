/*2.WAP to print the details of Student As Roll No Name and Marks by taking input from the user.*/
package ankitaPDec19.assignment4_1;

import java.util.Scanner;

public class Sol_2 {
      static String a;
	void display() {
		System.out.println("Enter the roll" + ":" + "Enter the Name" + ":" + "Enter the Marks");
		Scanner s = new Scanner(System.in);
		String[] ar = s.nextLine().split(":");
		for (int i = 0; i <= ar.length - 1; i++) {
			a = ar[i];
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Sol_2 sol_2 = new Sol_2();
		sol_2.display();
	}
}
