package amitJDec19.assignment2;
/*
 * Check if array contains a number in Java
 */
public class Question3 {
	void arrayContains (int[] num1 , int num2) {
		boolean compare = true;
		for(int i = 0; i <num1.length;i++)
		{
			if(num1[i] == num2)
			{
				compare = false;
				break;
			}
		}
		if(compare == false)	 
			System.out.println(num2+" is present in array");
		else
			System.out.println(num2+" is not present in array");		
	}
	public static void main(String[] args) {
		Question3 m1=new Question3();
		int[] num1= {1,2,3,4,5};
		int num2=3;
		m1.arrayContains(num1 , num2);
	}

}