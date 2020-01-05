package rutujaGDec19.assignment1;
/*
 *To add corresponding elements of two arrays of length n */
public class Question6 {
	void Sum(int[] x , int[] y){
		int sum = 0;
		for(int i = 0; i < x.length ; i++){
			for(int j = 0; j < y.length ; j++){
			if(i==j){
				System.out.println(x[i]+y[j]);
			}
		}
	}
}
	
	public static void main(String[] args){
		int[] arr1 = new int[]{11,24,66};
		int[] arr2 = new int[]{11,23,55};
		Question6 six = new Question6();
		six.Sum(arr1,arr2);
		
	}

}
