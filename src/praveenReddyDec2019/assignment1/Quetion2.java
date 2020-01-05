package praveenReddyDec2019.assignment1;
//Write a program to print the sum of all the elements of an array of size 4
public class Quetion2 {
	
		static void sum()
		{
			int[] num={6,3,8,5};
			System.out.println("array lenghth: "+num);
			int sum = 0;
			for (int i=0; i<4; i++)
			{
				sum=sum+num[i];
			}
			System.out.println("Sum of Array " + sum); 
		}
		public static void main(String[] args)
		{
			sum();
		}
		
}