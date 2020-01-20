package gautysingh.assignment1;

public class SquareOfArray 
{
  static int sum = 0;
  public void addArray(int[] n)
  {
    for(int i =0;i<n.length;i++)
    {
      sum = sum + n[i]*n[i];
    }
   
  }
  
    public static void main(String[] args) 
    {
      SquareOfArray a = new SquareOfArray();
      int[] a1 = {4,7,2,8,5};
      a.addArray(a1);
      System.out.println(sum);
      
    }
    
   
}
