package kedarKDec19.Assignment2;

public class Question11 {
/*
 * Print unique number from the two array
 * int a={1,3,6,9,7}
 * int b={2,5,6,9,8}
*/
	static void unique(int[]a,int[]b) {
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
			for(int j=0;j<b.length;j++) {
				if(b[j]!=a[j])
					System.out.println(b[j]);
				
			}
		}
	
	
public static void main(String[] args) {
	int[] a={1,3,6,9,7};
	int[] b={2,5,6,9,8};
	
	unique(a,b);
}
}



