package prasadSDec2019.Assignment1;

public class Question2 {
	
	int sumOfArray(int num[]) {
		int count=0;
		for(int i=0;i<num.length;i++) {
			count=count+num[i];
		}
		//System.out.println("Sum of 4 integers is "+count);
		return count;
	}

	public static void main(String[] args) {
		int num[]= {1,2,3,4};
		Question2 q2=new Question2();
		int count=q2.sumOfArray(num);
		System.out.println("Sum of 4 integers is "+count);
	}

}
