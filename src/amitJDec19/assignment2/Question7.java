package amitJDec19.assignment2;
/*
 * Find all pairs on integer array whose sum is equal to given number
 * Input:2, 4, 3, 5, 7, 8, 9
 * Given sum:7
 * Integer numbers, whose sum is equal to value:7
 * (2, 5)
 * (4, 3)
 */
public class Question7 {
	void pairSum(int[] num1, int num2) {
		for(int i =0; i < num1.length; i++)
		{
			for(int j = i+1; j < num1.length; j++)
			{
				if(num1[i] + num1[j] == num2)
					System.out.println("Pairs on integer array whose sum is equal to "+num2+" is: "+"("+num1[i]+","+num1[j]+")");
			}
		}
	}
	public static void main(String[] args) {
		Question7 m1=new Question7();
		int[] num1 = {2, 4, 3, 5, 7, 8, 9};
		int num2 = 7;
		m1.pairSum(num1,num2);
	}
}