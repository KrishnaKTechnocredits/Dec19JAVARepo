package Assignment2;

// Find duplicate number on Integer array in Java

public class Question2 {
	void differedIndex(int array1[]) {
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]==array1[j]) {
				System.out.println(" Duplicate number on Integer array is"+array1[i]);
			 }
		   }
	    }
    }

	public static void main(String[] args) {
		int array1[] = {0,3,1,2,3};
		Question2 q2=new Question2();
		q2.differedIndex(array1);
	}

}