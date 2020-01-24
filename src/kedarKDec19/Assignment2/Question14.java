package kedarKDec19.Assignment2;

public class Question14 {

	
	
	/*
	 * Print even number from array
	 * int[] a={15,24,52,49,62,10};
		
	 * 
	 */
		static void even(int[]a) {
			for(int i=0;i<a.length;i++){
				if (a[i]%2==0) {
					System.out.println("numbers are even number:"+a[i]);
				}
			 
					//System.out.println(a[i]);
				}
			}
		
					
				
			
		
		
	public static void main(String[] args) {
		int[] a={15,24,52,49,62,10};
		even(a);
		
	}
	
}
