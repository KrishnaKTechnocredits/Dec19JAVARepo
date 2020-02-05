package vaishg10695.Assignment4;

public class BasicProgramQ1 {

	void sum(int a, int b)
	{
		int total=a+b;
		System.out.println("1) Addition of two number is: "+ total);
	}
	
	void subtraction(int a, int b)
	{
		int total=a-b;
		System.out.println("2) subtraction of two number is: "+ total);
	}
	
	void multiplication(int a, int b)
	{
		int total=a*b;
		System.out.println("3) Multiplication of two number is: "+ total);
	}
	void division(int a, int b)
	{
		int total=a/b;
		System.out.println("4) Division of two number is: "+ total);
	}
	void remender(int a, int b)
	{
		int total=a%b;
		System.out.println("5) Remender of two number is: "+ total);
	}
	
	
	public static void main(String[] args) {

		int a=100;
		int b=50;
		System.out.println("Given 2 numbers are: a="+a+" b="+b);
		BasicProgramQ1 q1= new BasicProgramQ1();
		
		q1.sum(a,b);
		q1.subtraction(a,b);
		q1.multiplication(a,b);
		q1.division(a,b);
		q1.remender(a,b);

		
		


		
	}

}
