package surajSDec19.Assignment_3;

import java.util.Scanner;

/*WAP to find average of user given array
* a. Input :- {14, 32, 19, 14, 78,36}
*
*Author: Suraj Shinde
*/

public class Question_9 {

	public void average(int[] arr, int arrSize) {
		int sum=0;
		float average=0f;
		for(int i=0;i<arrSize;i++) {
			sum=sum+arr[i];
		}
		average=(float)sum/arrSize;
		System.out.println("Average of given array integers: "+average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
		System.out.println("Enter the integer of array of length "+arrSize);
		 for(int i=0;i<arrSize;i++) {
			 arr[i]=sc.nextInt();
		 }
		Question_9 question_9=new Question_9();
		question_9.average(arr,arrSize);
	}

}
