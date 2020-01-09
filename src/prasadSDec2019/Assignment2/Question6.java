package prasadSDec2019.Assignment2;

//Write a java program to check the equality of two arrays? 

public class Question6 {
	
	void sumEqual(int array1[],int array2[]) {
		int count=0;
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=array2[i]) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Two array are equal");
		}
		else {
			System.out.println("Array are not equal");
		}
	}

	public static void main(String[] args) {
		int array1[] = {2,4,3,2,7,9};
		int array2[] = {2,4,3,5,7,9};
		Question6 q6=new Question6();
		q6.sumEqual(array1,array2);
	}
}