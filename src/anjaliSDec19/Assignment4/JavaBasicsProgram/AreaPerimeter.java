/*
 * 4.	WAP to find the area and perimeter of Rectangle& Circle
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class AreaPerimeter {

	void areaCircle(int r)
	{
		System.out.println("Area of Circle is : "+(3.14*r*r));
	}
	void areaRect(int l, int w)
	{
		System.out.println("Area of Rectangle is : "+(w*l));
	}
	void periCircle(int r)
	{
		System.out.println("Perimeter of Circle is : "+ (2*3.14*r));
	}
	void periRect(int l, int w)
	{
		System.out.println("Perimeter of rectangle is : "+ (2*(l+w)));
		
	}
	public static void main(String[] args) {
		AreaPerimeter am = new AreaPerimeter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		int r =Integer.parseInt(scan.nextLine());
		System.out.println("Enter the width of the rectangle : ");
		int w =Integer.parseInt(scan.nextLine());
		System.out.println("Enter the length of the rectangle : ");
		int l =Integer.parseInt(scan.nextLine());
		am.areaCircle(r);
		am.areaRect(l, w);
		am.periCircle(r);
		am.periRect(l, w);
		scan.close();
	}
}
