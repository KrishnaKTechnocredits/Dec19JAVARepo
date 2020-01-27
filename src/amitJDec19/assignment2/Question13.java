package amitJDec19.assignment2;
/*
 * WAP to reveres array
 * 		a. int inputArray = {5, 6, 9, 10, 14, 63}
 * 		b. outputArray = {63, 14, 10, 9, 6, 5}
 */
public class Question13 {
	 void reversesArray(int[] num)
		{
			for(int i=num.length-1;i>=0; i--)
			{
				System.out.print(num[i]+" ");		
			}
		}
		public static void main(String[] args) {
			Question13 m1=new Question13();
			int num[] ={100,1,3,80,66,9};
			m1.reversesArray(num);		
		}
}