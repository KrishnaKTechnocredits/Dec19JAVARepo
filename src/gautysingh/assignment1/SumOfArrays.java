package gautysingh.assignment1;

public class SumOfArrays 
{
  static int sum = 0;
  public void addArray(int[] n)
  {
    for(int i =0;i<n.length;i++)
    {
      sum = sum + n[i];
    }
   
  }
  
    public static void main(String[] args) 
    {
      SumOfArrays a = new SumOfArrays();
      int[] a1 = {4,5,6,7,8,9};
      a.addArray(a1);
      System.out.println(sum);
      
    }
    
   
}
