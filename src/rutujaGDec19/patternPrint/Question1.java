package rutujaGDec19.patternPrint;

public class Question1 {
	public static void main(String[] args) {
			int i, j, k = 0;
			for(i = 1; i <= 5; ++i, k = 0){
				for(j = 1; j <= (5-i) ; ++j){
					System.out.print(" ");
			    }

			    while(k != 2 * i-1){
			    	System.out.print("*");
			    	++k;
			    }
                System.out.println();
			}
			
	}
	
}

