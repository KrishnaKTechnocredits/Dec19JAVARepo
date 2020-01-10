
 //01)a program to print the sum of two integer
 
public class AddTwoInteger {
	void add(int a,int b)
	{
		int sum= a+b;
		System.out.println("Sum of "+a +" & "+b+" is "+sum);		
	}
	public static void main(String[] args)
	{
		AddTwoInteger ad= new AddTwoInteger();
		ad.add(10,23);
	}

}