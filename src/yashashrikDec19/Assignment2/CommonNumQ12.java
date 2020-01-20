package yashashrikDec19.Assignment2;

/*12)WAP to print common number from two different array
a. int array1 = {1, 3, 6, 9, 7}
b. int array2 = {2, 5, 6, 9, 8}
output Array :- {6, 9}
*/

public class CommonNumQ12 {

	void displayCommonNum(int[] a1,int[] a2)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==a2[i])
				
				//System.out.println(a1[i]+","+a2[i]);
				System.out.print(+a1[i]);
			
		}
	}
	public static void main(String[] args) {
		CommonNumQ12 num= new CommonNumQ12();
		int[] arr1= {1,3,6,9,7};
		int[] arr2= {2,5,6,9,8};
		num.displayCommonNum(arr1,arr2);
		
	}
}
