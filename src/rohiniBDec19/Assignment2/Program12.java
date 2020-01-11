package rohiniBDec19.Assignment2;

/*12) WAP to print common number from two different array */

public class Program12 {
	void maxDiffIndex(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			   if(arr1[i]==arr2[i])
				{
		      
				    System.out.println("("+arr1[i]+","+arr2[i]+")");
		     
			   }	
	    	}
		
	}
	
	public static void main(String[] args) {
		Program12 prgm=new Program12();
		int arr1[]= {5,1,360,101,12};
		int arr2[]= {5,2,360,100,12};
		prgm.maxDiffIndex(arr1,arr2);
	
	}
}
