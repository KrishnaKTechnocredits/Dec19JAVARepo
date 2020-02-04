package kedarKDec19.Assignment3;

public class Question1 {
	
	
	static void posnegnum(int a[]) {
		int n=0;
		int p=0;
		int i;
		for(i=0;i<a.length;i++) {
			if (a[i]<0)
				n=n+a[i];	
			else if (a[i]>0)
			p=p+a[i];
		}
			System.out.println("Sum of positive numbers:"+p);
				
		System.out.println("Sum of negative numbers:"+n);
		
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {5,6,-9,14,25,6,7,-14};
		posnegnum(a);
		
	}
	
}
	
	

