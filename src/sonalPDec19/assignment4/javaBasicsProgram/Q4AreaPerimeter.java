package sonalPDec19.assignment4.javaBasicsProgram;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * 4.	WAP to find the area and perimeter of Rectangle& Circle
 */

public class Q4AreaPerimeter {

	static void findAreaPerimeter(double width, double length, double radius) {

		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);

		double areaOfRectangle = length * width;
		double perimeterofRectangle = 2 * (length + width);
		double areaOfCircle = Math.PI * radius * radius;
		double perimeterOfCircle = 2 + Math.PI * radius;

		System.out.println("Area of Rectangle: " + df.format(areaOfRectangle));
		System.out.println("Perimeter of Rectangle: " + perimeterofRectangle);
		System.out.println("Area of Circle: " + df.format(areaOfCircle));
		System.out.println("Perimeter of Circle: " + df.format(perimeterOfCircle));
	}

	public static void main(String[] args) {
		double w = 45.5;
		double l = 15.5;
		double r = 15;
		findAreaPerimeter(w, l, r);
	}
}
