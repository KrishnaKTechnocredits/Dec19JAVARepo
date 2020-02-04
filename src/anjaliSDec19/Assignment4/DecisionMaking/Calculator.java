/*
 * 7.	Write a Java Program and create Calculator using switchstatement
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class Calculator {
	void cal(String str)
	{
		Scanner scan = new Scanner(System.in);
		switch(str.charAt(0))
		{
		case '+':
			System.out.println("Enter a number : ");
			int a = Integer.parseInt(scan.nextLine());
			System.out.println("Enter a number : ");
			int b = Integer.parseInt(scan.nextLine());
			System.out.println("Addition is "+(a+b));
			break;
		case '-':
			System.out.println("Enter a number : ");
			int a1 = Integer.parseInt(scan.nextLine());
			System.out.println("Enter a number : ");
			int b1 = Integer.parseInt(scan.nextLine());
			if(a1>b1)
				System.out.println("Substraction is " +(a1-b1));
			else
				System.out.println("Substraction is " +(b1-a1));
			break;
		case '*':
			System.out.println("Enter a number : ");
			int a2 = Integer.parseInt(scan.nextLine());
			System.out.println("Enter a number : ");
			int b2 = Integer.parseInt(scan.nextLine());
			System.out.println("Multipllication is "+(a2*b2));
			break;
		case '/':
			System.out.println("Enter a number : ");
			int a3 = Integer.parseInt(scan.nextLine());
			System.out.println("Enter a number : ");
			int b3 = Integer.parseInt(scan.nextLine());
			if(a3!=0 && b3!=0)
			{
				if(a3>b3)
					System.out.println("Division is : "+a3/b3);
				else
					System.out.println("Division is : "+b3/a3);
			}
			else
				System.out.println("Either of the entered number is Zero");
			
			break;
		default:
			System.out.println("Select a valid operator!!");
			
			scan.close();
		}
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Select an operator from '+','-','*','/' : ");
		String str = scan.nextLine();
		c.cal(str);
		scan.close();
	}
}
