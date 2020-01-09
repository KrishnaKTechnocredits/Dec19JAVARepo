package chaitanyaKDec19.AssignmentTwo;

public class Question10 {
	
	void dislayMaxNumber(int[] arrOne, int[] arrTwo) {
		
		for(int i=0; i<arrOne.length; i++) {
				
			if(arrOne[i]>arrTwo[i]) {
				System.out.println("From ("+arrOne[i]+","+arrTwo[i]+") max value is: "+arrOne[i]);
			}else if(arrTwo[i]>arrOne[i]){
				System.out.println("From ("+arrOne[i]+","+arrTwo[i]+") max value is: "+arrTwo[i]);
			}
		}
	}

}
