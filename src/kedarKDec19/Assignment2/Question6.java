package kedarKDec19.Assignment2;

public class Question6 {
	/*
	 * Comparing Two array
	 * 
	 * 
	 */
	
	static void arrayMatched(int[] a,int[] b) {
		
		String flag="Y";
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]!=b[i])
				flag="N";	
					
		}
		if(flag=="Y")
			System.out.println("Two arrays are matched");
		
	}
		
		
		
	
	
	
	
public static void main(String[] args) {
	int[] arr1= {21,57,11,37,24};
	int[] arr2= {21,57,11,37,24};
	arrayMatched(arr1,arr2);
}
}
