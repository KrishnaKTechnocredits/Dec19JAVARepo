package yashashrikDec19.Assignment2;
/*8) Find first differ index from given arrays
i/p :- arr1: {10,2,9,14,3}
 arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2*/
public class ValueMatchQ8 {

	void displayIndex(int[] a1,int[] a2)
	{
		int i=0;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
				break;
				//flag="N";
			//num=a1[i];
				//System.out.println(i);
		}
		
			System.out.println("Values are not matching at index "+i);
	}
	
	public static void main(String[] args) {
		ValueMatchQ8 value=new ValueMatchQ8();
		int[] arr1= {10,2,9,14,3};
		int[] arr2= {10,2,18,14,3};
		value.displayIndex(arr1,arr2);
	}
}
