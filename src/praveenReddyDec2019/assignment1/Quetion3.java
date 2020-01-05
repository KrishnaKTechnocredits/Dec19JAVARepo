package praveenReddyDec2019.assignment1;
//Write a program to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 1≤N≤100 
public class Quetion3 {
	
		static void sum()
		{
			int[] num={6,3,8};
			//System.out.println("array length: "+num);
			int sum = 0;
			for (int i=0; i<=num.length-1;i++)
			sum=sum+num[i];
			System.out.println("Sum of Array " + sum); 
		}
		public static void main(String[] args)
		{
			sum();
		}
		
}