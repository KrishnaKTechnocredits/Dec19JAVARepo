package prasadSDec2019.Assignment2;

//Find all differ index from given arrays 

public class Question9 {
	
	void allDifferIndex(int array1[],int[] array2) {
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=array2[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int array1[] = {10,2,9,14,3};
		int array2[] = {10,2,18,14,13};
		Question9 q9=new Question9();
		q9.allDifferIndex(array1,array2);
	}
}
