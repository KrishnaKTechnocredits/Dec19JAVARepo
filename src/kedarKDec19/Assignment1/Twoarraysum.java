package kedarKDec19.Assignment1;

public class Twoarraysum {
	/*
	 * 
	 * 
	 * 
	 */
	static void num(int a[])
	{	
		int b = 0;
		int i;
	for(i=0;i<=a.length-1;i++) {
		
		b = b + a[i];
		System.out.println(b);
	}
	}
	
	
	
	
	public static void main(String[] args) {
     int c[] = {5,4,3,2,1};
	num(c);
}
}