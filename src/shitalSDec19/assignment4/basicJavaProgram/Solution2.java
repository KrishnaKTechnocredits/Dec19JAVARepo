/* 2.	WAP to print the details of Student As Roll No Name and Marks 
 * by taking input from the user. */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution2 {
	void printStudentDetails() {
		System.out.println("Please enter Student Name, Roll NO and Marks");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		int marks = sc.nextInt();
		System.out.println("Student Name is " + name + " , Roll no is " + rollNo + " and marks are " + marks);
	}

	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		solution2.printStudentDetails();
	}
}
