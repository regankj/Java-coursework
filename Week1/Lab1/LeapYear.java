public class LeapYear {
  public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);

      int year = keyboard.nextLine("Enter the year: ");

      if (year % 4 == 0){
        System.out.println(year + " is a leap year");
      }
      else {
        System.out.println(year + " is not a leap year");
      }
  }
}
