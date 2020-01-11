package rohiniBDec19.Assignment2;

/*7) Find all pairs on integer array whose sum is equal to given number? */

public class Program7 {
	boolean flag=true;
	void sumOfElement(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					flag=false;
			       System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		if(flag)
			System.out.println("Not a pair having sum of given number");
	}
	
	public static void main(String[] args) {
		Program7 prgm=new Program7();
		int arr[]= {1,2,51,100,50};
		int number=101;
		prgm.sumOfElement(arr,number);
		
		
	}
}
