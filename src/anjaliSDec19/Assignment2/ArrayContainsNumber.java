/*
 * WAP to check if array contains a number in java
 */
package anjaliSDec19.Assignment2;

public class ArrayContainsNumber {
	void findNumber(int[] arr, int num)
	{
		int cnt=0;
		for(int i =0; i<arr.length;i++)
		{			
			if(arr[i]==num)
				cnt++;
		}
		if(cnt==1)
			System.out.println("Number is there in the Array!!");
		else
			System.out.println("Number is not there in the Array!!");
		
	}
	public static void main(String[] args) {
		ArrayContainsNumber acn1 = new ArrayContainsNumber();
		int[] arr= {1,5,7,9,6};
		int num=2;
		acn1.findNumber(arr, num);
	}
}
