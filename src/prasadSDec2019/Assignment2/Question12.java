package prasadSDec2019.Assignment2;
// Find duplicate number on Integer array in Java

public class Question12 {
	void differedIndex(int array1[],int array2[]) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
				System.out.println(array1[i]);
			 }
		   }
	    }
    }

	public static void main(String[] args) {
		int array1[] = {1, 3, 6, 9, 7};
		int array2[] = {2, 5, 6, 9, 8};
		Question12 q12=new Question12();
		q12.differedIndex(array1, array2);
	}

}
