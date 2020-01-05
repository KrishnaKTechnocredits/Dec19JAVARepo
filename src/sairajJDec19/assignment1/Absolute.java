package sairajJDec19.assignment1;
class Absolute
{
  int printAbsolute(int n, int m)
  {
    int num = n-m;
    if (num<0) {
      num = num * -1;
    }
    else {
      num = num;
    }
    return num;
  }
  public static void main(String[] args) {
    Absolute a1 = new Absolute();
    System.out.println(a1.printAbsolute(5,10));
  }
}
