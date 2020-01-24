package kedarKDec19.Assignment2;

public class Question9 {
/*
 * 
 * find all differ index from given array 
 * 
 */
	static void differ(int[] a,int[] b) {
		
		int i;
	
		for (i=0;i<a.length;i++) {
			
			if (a[i]!=b[i]);
			continue;
		}
			System.out.println("differ value:"+ i);
		}
		
	
	
	
	public static void main(String[] args) {

		int[] a = { 10, 2, 9, 14, 3 };
		int[] b = { 10, 2, 18, 14, 13 };
		
		differ(a,b);
		
	}
}
