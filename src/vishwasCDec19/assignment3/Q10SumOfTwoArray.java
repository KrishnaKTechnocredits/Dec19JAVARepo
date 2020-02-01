package vishwasCDec19.assignment3;
/*Sum of elements of two arrays*/
import java.util.Scanner;
public class Q10SumOfTwoArray 
{
	static int calSum(int[] arr1,int[] arr2) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		int sum =  calSum(arr1, arr2);
		System.out.println("The sum is : "+ sum);
	}

}
