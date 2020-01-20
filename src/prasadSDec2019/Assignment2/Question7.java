package prasadSDec2019.Assignment2;

// Find all pairs on integer array whose sum is equal to given number? 

public class Question7 {
	
	void sumEqual(int array1[],int n) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1.length;j++) {
				if(array1[i]+array1[j]==n) {
					System.out.println(array1[i]+" "+array1[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int array1[] = {2,4,3,5,7,9};
		Question7 q7=new Question7();
		q7.sumEqual(array1,7);
	}
}