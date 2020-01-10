/*
 * find duplicate number in integer array in java 
 */
package anjaliSDec19.Assignment2;

public class DuplicateNumber {
	void findDuplicate(int[] arr)
	{
		for (int i=0;i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Duplicate Number is :"+arr[i]);
			}
		}
	}
public static void main(String[] args) {
	DuplicateNumber dn1 = new DuplicateNumber();
	int[] arr= {0,3,1,6,8,3};
	dn1.findDuplicate(arr);
}
}
