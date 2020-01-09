package Assignment2;

public class Question11 {
	int count=0;
	boolean duplicate = false;
	int differedIndex(int array1[],int array2[]) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					duplicate=true;
					break;
				}	
			}
			if(!duplicate) {
				count++;
			}
				else {
					duplicate=false;
				}
		}
		return count;
	}


	public static void main(String[] args) {
		int array1[] = {1, 3, 6, 9, 7};
		int array2[] = {2, 5, 6, 9, 8};
		Question11 q11=new Question11();
		int count=q11.differedIndex(array1, array2);
		System.out.println(count);
	}

}
