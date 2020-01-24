package kedarKDec19.Assignment2;

public class Question1 {
	
	/*
	 * Print missing number from 1 to 10 
	 * 
	 * 
	 * 
	 */

	static void missing(int[]a) {
		
		for (int i=1;i<=10;i++) {
			
			String found ="n";
		 
			for (int j=0;j<a.length;i++) {
				
				if (i==a[j]) {
					 found ="y";
					break;
				}
				}
			if (found=="n")
			{
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,5,6,7,8,9,10};
		missing(a);
		
	}
}
