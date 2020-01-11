package rohiniBDec19.Assignment2;

/*6)Write a java program to check the equality of two arrays? */

public class Program6 {
	int count=0;
	void compArr(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]&&arr1.length==arr2.length)
				 count++;
			}
			
		}
		if(count==arr1.length)
			System.out.println("Two Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		
		
	}
	
	public static void main(String[] args) {
		Program6 prgm=new Program6();
		int arr1[]= {1,2,360,100};
		int arr2[]= {1,2,360,100};
		prgm.compArr(arr1, arr2);
		
		
	}

}
