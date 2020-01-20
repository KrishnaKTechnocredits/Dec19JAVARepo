package rohiniBDec19.Assignment2;

/*8) Find first differ index from given arrays */

public class Program8 {
	void firstDiffIndex(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			   if(arr1[i]!=arr2[i])
				{
				    System.out.println("Values are not maching at index: "+i);
				    break;
	
		       }	
		}
		
	}
	
	public static void main(String[] args) {
		Program8 prgm=new Program8();
		int arr1[]= {2,2,360,101,11};
		int arr2[]= {2,2,360,100,12};
		prgm.firstDiffIndex(arr1,arr2);
		
		
	}

}
