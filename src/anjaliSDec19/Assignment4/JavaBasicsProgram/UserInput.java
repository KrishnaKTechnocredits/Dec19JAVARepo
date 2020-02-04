/*
 * 2.	WAP to print the details of Student As Roll No Name and Marks by taking input from theuser.
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Roll No : ");
		int rno = Integer.parseInt(scan.nextLine());
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		scan.close();
		System.out.println("Entered Roll No is : "+rno);
		System.out.println("Entered Name is : "+name);
	}
}
