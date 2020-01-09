package chaitanyaKDec19.AssignmentTwo;

public class Question9 {
	
	void displayDifferIndices(int[] arrOne, int[] arrTwo) {
		
		for(int i=0; i<arrOne.length; i++) {
				
			if(arrOne[i]!=arrTwo[i])
				System.out.println("Indix at which value differ is: "+i);			
		}
		
	}

}
