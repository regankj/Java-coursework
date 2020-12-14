public class ForLoop {
  public static void main (String[] args){
    int sum = 0;

    for (int value = 2; value <= 16; value += 2){
      sum += value;
    }
    System.out.println(sum);
  }
}
