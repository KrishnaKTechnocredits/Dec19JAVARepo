package amitJDec19.assignment2;
/*
 * Find max value at differed index
 * i/p:- arr1: {10,2,9,14,3}
 * 		 arr2: {10,2,18,14,3}
 * o/p:- Values are not matching at index -> 2
 * 		 From (9,18) max value is 18
 */
public class Question10 {
	void maxValueAtDifferIndex(int[] num1, int[] num2) {
		if(num1.length == num2.length)
		{
			int i;
			for(i = 0; i < num1.length; i++)
			{
				if(num1[i] < num2[i])
				{
					System.out.println("Values are not matching at index -> "+i);
					System.out.println("From ("+num1[i]+","+num2[i]+") max value is "+num2[i]);
				}
			}
		}
	}
public static void main(String[] args) {
		Question10 m1=new Question10();
		int[] num1 = {10,2,9,14,3};
		int[] num2 = {10,2,18,14,3};
		m1.maxValueAtDifferIndex(num1,num2);
	}
}