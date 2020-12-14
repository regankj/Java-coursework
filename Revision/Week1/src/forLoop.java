public class forLoop {
    public static void main( String[] args ){
        int total = 0;
        for (int i = 2; i <= 16; i = i + 2){
            total = total + i;
        }
        System.out.println("Total = " + total);
    }
}
