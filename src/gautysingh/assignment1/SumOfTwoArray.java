package gautysingh.assignment1;

public class SumOfTwoArray 
{
  
  public void addArray(int[] n,int [] m)
  {
   // int [] sum = new int[n.length];
    
    for(int i = 0;i<n.length;i++)
      {
         System.out.println(n[i]+m[i]);
      }
	  
    // System.out.println(sum); 
    }
  
    public static void main(String[] args) 
    {
      SumOfTwoArray a = new SumOfTwoArray();
      int[] a1 = {3,9,8};
      int[] a2 ={8,12,21};
      a.addArray(a1,a2);
      
      
    }

}
