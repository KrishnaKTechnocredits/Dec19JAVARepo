package kedarKDec19.Assignment2;

public class Question10 {
	
	/*
	 * Find max length at different index
	 * 
	 * arr1:{10,2,9,14,3};
	 * arr2:{10,2,18,14,3}
	 */

	
	void max(int[] arr1,int[] arr2) {
		int i;
		for (i=0;i<=arr1.length;i++)
		{
			if (arr1[i]!=arr2[i])
				System.out.println("value not matched:"+i);
		if(arr1[i]>arr2[i])
			System.out.println("value of:"+ arr1[i]+","+arr2+"max value is "+ arr1[i]);
	else
		System.out.println("value of:"+ arr1[i]+","+arr2+"max value is "+ arr2[i]);
		}
	}
	
	public static void main(String[] args) {
		Question10 d=new Question10();
		
		int[] arr1={10,2,9,14,3};
		 int[] arr2={10,2,18,14,3};
	
		 d.max(arr1,arr2);
	}
	
}
