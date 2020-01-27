package amitJDec19.assignment2;
/*
 * Find the missing number in integer array of 1 to 10
 */
public class Question1 {
	 void missingNumber(int[] a) {
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != i+1)
			{
				System.out.println("Missing number in integer array of 1 to 10 is: "+(i+1));
				break;
			}
		}
	}
	public static void main(String[] args) {
		Question1 m1=new Question1();
		int[] a = {1,2,4,5,6,7,8,9,10};
		m1.missingNumber(a);
	}
}