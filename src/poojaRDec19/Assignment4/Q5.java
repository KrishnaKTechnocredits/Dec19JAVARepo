package poojaRDec19.Assignment4;
//Write a Java program to compute simpleinterest

public class Q5 {

	void simpleInterest(int p,int r,int t)
	{
		int sI=(p*r*t)/100;
		System.out.println("Simple Interest is : "+sI);
	}
	public static void main(String args[])
	{
		Q5 q5=new Q5();
		int priciple=1500, rate=4,time=2;
		q5.simpleInterest(priciple,rate,time);
	}
}
