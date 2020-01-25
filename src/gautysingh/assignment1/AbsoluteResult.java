package gautysingh.assignment1;

public class AbsoluteResult
{
  static int diff = 0;
  public void absoluteDiff(int n,int m)
  {
      
    if(n>0 && m>0){
      if(n>m){
        diff = n-m;
      }else{ 
        diff = m-n;
      }
    }else{ 
      if(n<0){
      n = n*-1;
    }if(m<0){
      m= m*-1;
    }
      absoluteDiff(n,m); 
    }
    
  }
  
    public static void main(String[] args) 
    {
      AbsoluteResult a = new AbsoluteResult();
      int a1 =8;
      int a2 =-21;
      a.absoluteDiff(a1,a2);
     System.out.println(diff); 
    }

}
