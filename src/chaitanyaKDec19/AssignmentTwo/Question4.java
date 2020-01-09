package chaitanyaKDec19.AssignmentTwo;

public class Question4 {

	void displayMaxMin(int[] arrOne) {
		
		int maxNum = arrOne[0];
		int minNum = arrOne[0];
		
		for(int i=0; i<arrOne.length; i++) {
			
			if(arrOne[i]>maxNum) {
				maxNum = arrOne[i];
			}else if(arrOne[i]<minNum) {
				minNum = arrOne[i];
			}
		}
		
		System.out.println("Largest number from given array is: "+maxNum);
		System.out.print("Smallest number from given array is: "+minNum);
		
	}
}
