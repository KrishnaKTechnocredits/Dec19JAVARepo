package rohiniBDec19.Assignment2;

/*9) Find all differ index from given arrays */

public class Program9 {
	void allDiffIndex(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			   if(arr1[i]!=arr2[i])
				{
				    System.out.println("Values are not maching at index: "+i);
	
		       }	
		}
		
	}
	
	public static void main(String[] args) {
		Program9 prgm=new Program9();
		int arr1[]= {5,1,360,101,12};
		int arr2[]= {5,2,360,100,12};
		prgm.allDiffIndex(arr1,arr2);
		
		
	}


}
