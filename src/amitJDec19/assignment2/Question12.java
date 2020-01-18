package amitJDec19.assignment2;
/*
 * WAP to print common number from two different array
 * a. int array1 = {1, 3, 6, 9, 7}
 * b. int array2 = {2, 5, 6, 9, 8}
 * 	  output Array :- {6, 9}
 */
public class Question12 {
	void commonNumber(int[] num1, int[] num2) {
		for (int i = 0; i < num1.length; i++) 
		{
			for (int j = 0; j < num2.length; j++) 
			{
				if(num1[i] == num2[j])
					System.out.print(num1[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Question12 m1=new Question12();
		int[] num1 = {1, 3, 6, 9, 7};
		int[] num2 = {2, 5, 6, 9, 8};
		m1.commonNumber(num1,num2);
	}
}