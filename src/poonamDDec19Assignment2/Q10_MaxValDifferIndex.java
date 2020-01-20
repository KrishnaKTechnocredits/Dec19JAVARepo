package poonamDDec19Assignment2;
/*
 *  Find first differ index from given arrays 
 */
public class Q10_MaxValDifferIndex {
	
	static void findDifferIndex(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
				if(arr1[i]>arr2[i])
					System.out.println("Max value between different index value "+arr1[i] + " and "+arr2[i] + " is "+arr1[i]);
				else if(arr2[i]>arr1[i])
					System.out.println("Max value between different index value "+arr1[i] + " and "+arr2[i] + " is "+arr2[i]);
	    }
		
	}
	public static void main(String[] args)  {
		int [] arr1= {10,2,9,14,3} ;
		int [] arr2= {10,2,18,14,3} ;
		findDifferIndex(arr1, arr2);

	}
		

}
