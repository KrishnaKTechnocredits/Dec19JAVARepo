package kedarKDec19.Assignment3;

public class Question10 {
	
	
	static void sum(int a[],int b[]) {
		
		int sum=0;
		int i=0;
		int j=0;
		
		while(i<a.length) {
			sum=sum+a[i];
		i++;
		}
		
		while(j<b.length) {
			sum=sum+b[j];
			j++;
			
		}
		
		System.out.println("sum of number is :"+sum);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		int a[]= { 1, 5, 9, 3, 7 };
		int b[]= {1,7,9,3};
		sum(a,b);
		
				
		
	}
	

}
