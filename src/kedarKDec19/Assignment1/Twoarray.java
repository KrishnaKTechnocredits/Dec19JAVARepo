package kedarKDec19.Assignment1;

public class Twoarray {
	
	/*
	 *sum of two arrrays 
	 *
	 * 
	 */
	
	static void sum(int c[],int d[])
	{
		for(int i=0;i<=c.length-1;i++) {
			int num=c[i]+d[i];
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		int a[]= {8,9,7};
		int b[]= {6,5,4};
		sum(a,b);
		
	}

}
