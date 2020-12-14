public class whileLoop {
    public static void main( String[] args ){
        int total = 0;
        int i = 2;
        while (i <= 16){
            total = total + i;
            i = i + 2;
        }
        System.out.println("Total = " + total);
    }
}
