package prasadSDec2019.Assignment2;

//WAP to reveres array 

public class Question13 {
	
	void reveresArray(int inputArray[]) {
		int temp;
		int start=0;
		int end=inputArray.length-1;
		//System.out.println(end);
		
		while(start<end) {
			temp=inputArray[start];
			inputArray[start]=inputArray[end];
			inputArray[end]=temp;
			start++;
			end--;
		}
		System.out.println("Array after reverse");
		for(int j=0;j<inputArray.length;j++) {
			System.out.println(inputArray[j]);
		}
	}
	
	public static void main(String[] args) {
		int inputArray[]= {5, 6, 9, 10, 14, 63};
		Question13 q13=new Question13();
		q13.reveresArray(inputArray);
	}
}
