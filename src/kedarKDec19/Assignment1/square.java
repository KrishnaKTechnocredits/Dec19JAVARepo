package kedarKDec19.Assignment1;

public class square {
	
	
	/*
	 * Square of number and sum
	 * 
	 * 
	 */
	
    static void kedar(int a[])       {
    	 int sum=0;
         int c=0;
	for (int i=0;i<a.length;i++) {
	  c= (a[i]*a[i]);
	sum=sum+c;
	}
	 System.out.println(sum);
	
    }
    
	public static void main(String[] args) {
     int r[]= {4,7,2,8,5};
	kedar(r);
	
		
		
		
	}
}
