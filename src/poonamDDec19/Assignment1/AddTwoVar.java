package poonamDDec19.Assignment1;
/*
 *  a program to print the sum of two integer
 */
public class AddTwoVar {
	void add(int x,int y)
	{
		int sum= x+y;
		System.out.println("Sum of "+x +" & "+y+" is "+sum);		
	}
	public static void main(String[] args)
	{
		AddTwoVar ad= new AddTwoVar();
		ad.add(5,7);
	}

}
