public class Longest {
  public static void main(String[] args){
  int a = 5;
  int b = 3;
  int c = 4;
  int longest;
  if (a > b){
    if (a > c)
      longest = a;
    else
      longest = c;
  }
  else {
    if (b > c)
      longest = b;
    else
      longest = c;
  }
  System.out.println("Longest side is " + longest);
  }
}
