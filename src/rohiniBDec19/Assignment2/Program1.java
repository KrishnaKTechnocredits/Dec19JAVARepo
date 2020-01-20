package rohiniBDec19.Assignment2;

/*1) Find the missing number in integer array of 1 to 10? */

public class Program1 {
	 int findMissing(int a[])
	   {
		
		int actualSum=0;
		   for(int i=0;i<a.length;i++)
		   {
			   actualSum=actualSum+a[i];  
				
			}
		   return actualSum;
		}
		
		 public static void main(String[] args) {
			Program1 pgrm = new Program1();
			int sum=55; //sum 1 to 10
			int[] num= {0,1,2,3,4,5,6,7,8,9};
			int actualSum=pgrm.findMissing(num);
			System.out.println("Missing number is "+(sum-actualSum));
		
			
	   }

}
