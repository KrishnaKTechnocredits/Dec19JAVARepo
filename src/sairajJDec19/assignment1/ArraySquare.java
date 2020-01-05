package sairajJDec19.assignment1;
class ArraySquare
{
  int printSquare(int[]a)
  {
    int sum = 0;
    for (int i=0;i<a.length ;i++ )
    {
      sum = sum + (a[i]*a[i]);
    }
    return sum;
  }
  public static void main(String[] args) {
    int [] arr = {4,7,2,8,5};
    ArraySquare a1 = new ArraySquare();
    System.out.println(a1.printSquare(arr));
  }
}
