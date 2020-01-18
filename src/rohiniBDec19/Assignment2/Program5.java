package rohiniBDec19.Assignment2;

/*5)Write a java program to find second largest element in an array of integers? */

public class Program5 {
	
	int temp;
	void findNum(int arr[]) {	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			 }
		}
		System.out.println("second Largest number is: "+arr[arr.length-2]);
		
	}
	
	public static void main(String[] args) {
		Program5 prgm =new Program5();
		int[] arr= {1,4,15,10,30,45};
		prgm.findNum(arr);
	}

}
