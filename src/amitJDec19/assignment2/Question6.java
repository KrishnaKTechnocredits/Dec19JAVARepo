package amitJDec19.assignment2;
/*
 * Write a java program to check the equality of two arrays?
 * Hint: Input Arrays :
 * First Array : [21, 57, 11, 37, 24]
 * Second Array : [21, 57, 11, 37, 24]
 * Two Arrays Are Equal
 */
public class Question6 {
	void equalArrays(int[] num1, int[] num2) {
		if(num1.length == num2.length)
		{
			for(int i = 0; i < num1.length; i++)
			{
				num1[i] = num2[i];
			}
			System.out.println("Two Arrays Are Equal");
		}
		else
			System.out.println("Two Arrays Are Not Equal");
	}
	public static void main(String[] args) {
		Question6 m1=new Question6();
		int []num1 = {21, 57, 11, 37, 24};
		int []num2 = {21, 57, 11, 37, 24};
		m1.equalArrays(num1,num2);
	}
}