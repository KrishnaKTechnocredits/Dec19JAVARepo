package praveenReddyDec2019.assignment1;

public class Quetion4 {
	static void squareOfArray()
	{
		int [] a1={4,7,2,8,5};
		int square=0;
		for(int i=0;i<a1.length;i++)
		{	 
			
			square = square +(a1[i]*a1[i]);
		}
		System.out.println("Square of array is :" +square);
	}
	public static void main(String[] args)
	{
	 squareOfArray();
	}
}