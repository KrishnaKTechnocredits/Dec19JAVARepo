package rutujaGDec19.patternPrint;

public class Question5 {
	public static void main(String[] args){
		int  i, j = 0;
	
		for(i=5; i>=1; --i){
			for(j=0; j < 5-i; ++j) {
				System.out.print(" ");
			}	
			for(j=i; j <= 2*i-1; ++j) {
				System.out.print("*");
	        }	
			for(j=0; j < i-1; ++j) {
				System.out.print("*");
	        }	
		System.out.println();
		}

	}
}
