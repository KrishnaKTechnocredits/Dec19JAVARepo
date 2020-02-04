package poojaRDec19.Assignment4;
//WAP to find the area and perimeter of Rectangle& Circle

public class Q4 {
 
	void rectangle(int length,int breadth)
	{	
		int area =length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("area of rectangle : "+area);
		System.out.println("perimeter of rectangle : "+perimeter);
	}
	void circle(int r)
	{
		double area=3.14*r*r;
		double perimeter=2* 3.14*r;
		System.out.println("area of circle : "+area);
		System.out.println("perimeter of circle : "+perimeter);
	
	}
	public static void main(String[] args) {
		int length=10,breadth=12;
		int radious=4;
		Q4 q4=new Q4();
		q4.rectangle(length, breadth);
		q4.circle(radious);
	}

}
