package sairajJDec19.assignment1;

public class sum{
  
		int printSum(int x, int y)
		{
			int sum;
			sum = x+y;
			return sum;
		}
		public static void main(String[] args){
			sum s1 = new sum();
			System.out.println(s1.printSum(11,9));
		}
}
