package ankitaPDec19.assignment1;

public class Question6 {
	 public static void main(String [] args){
		    int [] arr1 = {3,9,8};
			int [] arr2 = {8,12,74};
			add(arr1,arr2);
		}	
			
		 public static void add(int [] arr1, int [] arr2){
			 int [] result = new int[arr1.length];
			    if (arr1.length == arr2.length){
		         for (int i = 0; i < arr1.length; i++)
			       {
			        result[i] = arr1[i] + arr2[i];
					System.out.println(result[i]);
				   }     
		        }  
			}
}

