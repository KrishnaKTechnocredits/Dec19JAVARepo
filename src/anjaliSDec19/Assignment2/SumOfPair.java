/*
 * find all pairs in integer array whose sum is equal to given number 
 */
package anjaliSDec19.Assignment2;

public class SumOfPair {

	void findSumPair(int[] arr, int num)
	{
		int cnt=0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if((arr[i]+arr[j])==num)
				{
					cnt++;
					System.out.println("Integer Numbers whoes sum is equal to value :"+arr[i]+ " "+arr[j]);
				}
			}
		}
		if(cnt==0)
			System.out.println("No integers sum is equal to the number!");
	}
	public static void main(String[] args) {
		SumOfPair sum_pair =new SumOfPair();
		int[] arr= {1,6,2,4,3,5,7,8,9};
		int num=7;
		sum_pair.findSumPair(arr, num);
	}
}
