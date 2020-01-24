package kedarKDec19.Assignment2;

public class Question13 {

	/*
	 * Print reverse number from array
	 * int[] a={5,6,10,14,63};
		op={63,14,10,9,6,5};
	 * 
	 */
		static void reverse(int[]a) {
			for(int i=a.length-1;i>=0;i--){
			 
					System.out.println(a[i]);
				}
			}
		
					
				
			
		
		
	public static void main(String[] args) {
		int[] a={5,6,10,14,63};
		reverse(a);
		
	}
	}

