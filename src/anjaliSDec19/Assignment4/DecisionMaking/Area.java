/*
 * 10.	Write a program to calculate area of Rectangle, 
 * area of Triangle and 
 * area of Circle usingswitch statement. Make it a menu drivenprogram..
Formulas:-Area Of rectangle=length*breadth Area oftriangle=1/2*base*height
Area ofCircle=3.14*radius*radius

 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class Area {

	void calArea(int num)
	{
		Scanner scan = new Scanner(System.in);
		switch(num)
		{
		case 1:
			System.out.println("Enter the base of triangle");
			int base = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the height of triangle");
			int height = Integer.parseInt(scan.nextLine());
			float area=(float) (0.5*(base*height));
			System.out.println("Area of Triangle is : "+area);
			break;
		case 2:
			System.out.println("Enter the radius of circle");
			int radius = Integer.parseInt(scan.nextLine());
			float area1=(float) (3.14* (float)radius * (float)radius); 
			System.out.println("Area of Circle is : "+area1);
			break;
		case 3:
			System.out.println("Enter the lenght of rectangle");
			int lenght = Integer.parseInt(scan.nextLine()); 
			System.out.println("Enter the breadth of rectangle");
			int breadth = Integer.parseInt(scan.nextLine());
			int area2 = lenght * breadth;
			System.out.println("Area of rectangle is : "+area2);
			break;
		default:
			System.out.println("Entered choise is not in display");
			
		scan.close();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Select 1 for Triangle, 2 for Circle, 3 for Rectangle");
		int num = Integer.parseInt(scan1.nextLine());
		Area obj = new Area();
		obj.calArea(num);
		scan1.close();
	}
}
