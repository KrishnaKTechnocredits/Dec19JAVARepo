package kedarKDec19.Assignment2;

public class Question12 {
/*
 * Print common number from two different array
 * int[] a={1,3,6,9,7};
	int[] b={2,5,6,9,8};
 * 
 */
	static void common(int[]a,int[]b) {
		for(int i=0;i<a.length;i++){
		 {
			if (a[i]==b[i]) {
				System.out.println(+a[i]);
			}
		}
	
				
			}
		}
	
	
public static void main(String[] args) {
	int[] a={1,3,6,9,7};
	int[] b={2,5,6,9,8};
	common(a,b);
	
}
}