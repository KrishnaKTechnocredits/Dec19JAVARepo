package amitJDec19.assignment2;
/*
 * WAP to print even number from the array
 * 		int a = {15, 24, 52, 49, 62, 10};
 * 		output:- {24, 52, 62, 10}
 */
public class Question14 {
	void evenNumberInArray(int[] num) 
	{
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
				System.out.print(num[i]+" ");
		}	
	}
	public static void main(String[] args) {
		Question14 m1=new Question14();
		int[] num = {15, 24, 52, 49, 62, 10};
		m1.evenNumberInArray(num);
	}
}