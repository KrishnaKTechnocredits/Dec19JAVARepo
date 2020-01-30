package vishwasCDec19.assignment4;
/*
 * 4.	WAP to find the area and perimeter of Rectangle& Circle
 */
import java.util.Scanner;
public class Q4AreaOfRect 
{
	
	    int r, l, b, s1, s2, s3,A;
	    double pi = 3.14,perimeter;
	    Scanner s = new Scanner(System.in);
	    void circle()
	    {
	        System.out.print("Enter radius of circle:");
	        r = s.nextInt();
	        perimeter = 2 * pi * r;
	        System.out.println("Perimeter of circle:"+perimeter);
	       
	         double  area=(22*r*r)/7 ;
	         System.out.println("Area of Circle is: " + area);   
	    } 
	    void rectangle()
	    {
	        System.out.print("Enter length of rectangle:");
	        l = s.nextInt();
	        System.out.print("Enter breadth of rectangle:");
	        b = s.nextInt();
	        perimeter = 2 * (l + b);
	        System.out.println("Perimeter of rectangle:"+perimeter);
	        A=l*b;
	        System.out.println("Area of rectangle:"+A);
	        
	    }
	    
	    public static void main(String[] args) 
	    {
	    	Q4AreaOfRect obj = new Q4AreaOfRect();
	        obj.circle();
	        obj.rectangle();
	        
	    }
	}
	

