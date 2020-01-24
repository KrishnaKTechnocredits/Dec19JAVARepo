package kedarKDec19.Assignment2;

public class question8 {
	
	/*
	 * value not matching at index 2 program
	 * 
	 */
static void differ(int a[],int b[]) {
	int i;
	for (i=0;i<a.length;i++) {
		if (a[i]!=b[i])
			break;
	}
	System.out.println("value not matching at :"+i);
}

public static void main(String[] args) {
	int a[]= {10,2,9,14,3};
	int b[]= {10,2,18,14,3};
	
	differ(a,b);
}
}
