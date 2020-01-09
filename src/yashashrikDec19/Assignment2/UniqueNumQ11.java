package yashashrikDec19.Assignment2;
/*11)WAP to print unique number from the two different array
a. int array1 = {1, 3, 6, 9, 7},
b. int array2 = {2, 5, 6, 9, 8}
output Array :- {1, 3, 6, 9, 7, 2, 5, 8}*/
public class UniqueNumQ11 {

	void displayUniqueNumbers(int[] a1,int[] a2)
	{
		for(int i=0;i<a1.length;i++)
		{
			//if(a1[i]!=a2[i] && a2[i]!=a1[i] )
				System.out.print(a1[i]);
				
		}
		for(int j=0;j<a1.length;j++)
		{
			if(a2[j]!=a1[j])
				System.out.print(a2[j]);
		}
	}
	public static void main(String[] args) {
		UniqueNumQ11 unum=new UniqueNumQ11();
		int[] arr1= {1,3,6,9,7};
		int[] arr2= {2,5,6,9,8};
		unum.displayUniqueNumbers(arr1,arr2);
	}
}
