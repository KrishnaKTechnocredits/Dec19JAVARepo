package sairajJDec19.assignment1;

public class ArraySum{
  
	int sumOfArray(int[]a)
	{
    int sum = 0;
    for (int i =0;i<a.length ;i++ )
    {
      sum = sum + a[i];
    }
    return sum;
  }
	public static void main(String[] args) {
    int[] arr = {6,3,8};
    ArraySum a1 = new ArraySum();
    System.out.println(a1.sumOfArray(arr));
  }
}
