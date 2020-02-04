package sairajJDec19.assignment1;

public class Vowels
{
  int getCount(String s)
  {
    int count = 0;
    for (int j =0;j<s.length() ;j++ ) {
      char ch = s.charAt(j);
      if (ch =='a') {
        count++;
      }
      else if (ch == 'e') {
        count++;
      }
      else if (ch == 'i') {
        count++;
      }
      else if (ch == 'o') {
        count++;
      }
      else if (ch == 'u') {
        count++;
      }
      else {
      }
    }
    return count;
  }
  public static void main(String[] args) {
    String temp = "Sairaj Jadhav";
    Vowels v1 = new Vowels();
    System.out.println(v1.getCount(temp));
  }
}
