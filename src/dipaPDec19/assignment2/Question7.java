package dipaPDec19.assignment2;
/*
 * Find all pairs on integer array whose sum is equal to given number
 * Input:{2, 4, 3, 5, 7, 8, 9} Given sum:7 Integer numbers, whose sum is equal to value:7 (2, 5) (4, 3)
 */
public class Question7 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 9};
		int sum = 7;
		getcount(arr,sum);
	}

	static void getcount(int[] a, int sum) {
		int i,j;
		for(i =0; i < a.length; i++)
		{
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] + a[j] == sum)
					
					System.out.println("Integer numbers, whose sum is equal to value :"+sum+" "+"("+a[i]+","+a[j]+")");
			}
		}
		
	}

}
