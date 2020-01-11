package rohiniBDec19.Assignment2;

/*10) Find max value at differed index */

public class Program10 {
	void maxDiffIndex(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			   if(arr1[i]!=arr2[i])
				{
		          if(arr1[i]>arr2[i])
				    System.out.println("Values are not maching at index: "+i+" and max value from pair is: "+arr1[i]);
		          else
		        	  System.out.println("Values are not maching at index: "+i+" and max value from pair is: "+arr2[i]);
		          
			   }	
	    	}
		
	}
	
	public static void main(String[] args) {
		Program10 prgm=new Program10();
		int arr1[]= {5,1,360,101,12};
		int arr2[]= {5,2,360,100,12};
		prgm.maxDiffIndex(arr1,arr2);
		
		
	}

}
