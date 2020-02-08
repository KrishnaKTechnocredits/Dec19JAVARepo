/*
 * 9.	WAP to input student marks by condition:
Marks is greater than 0 and less than50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100Distinction

 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class Marks {

	void grade(int marks)
	{
		if(marks>=0 && marks<=50)
			System.out.println("Failed");
		else if(marks>=50 && marks <=75)
			System.out.println("1st Class");
		else if(marks>75 && marks <=100)
			System.out.println("Distinction");
		else
			System.out.println("Entered marks are not between 0 to 100");
			
	}
	public static void main(String[] args) {
		Marks obj = new Marks();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks between 0 to 100 : ");
		int marks = Integer.parseInt(scan.nextLine());
		obj.grade(marks);
		scan.close();
	}
}
