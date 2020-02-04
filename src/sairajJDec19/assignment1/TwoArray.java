package sairajJDec19.assignment1;

public class TwoArray
{
  static void addArrays(int[]a, int[]b)
  {
    for (int i =0;i<a.length ;i++ ) {
      for (int j=0;j<b.length ;j++ ) {
        if (i==j) {
        System.out.println(a[i]+b[j]);
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] aarr = {3,9,8};
    int[] barr = {8,12,74};
    addArrays(aarr,barr);
  }
}
