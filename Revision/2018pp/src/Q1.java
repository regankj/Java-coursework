public class Q1 {
    public static void main(String[] args){
        int i = 31;
        double d = 2.7;
        double res1 = d * (5/3) + i;
        double res2 = i%2 == 0 ? d : -d;
        StringBuffer buffer = new StringBuffer("Test123");
        buffer.replace(3, 5, "#");
        String res3 = buffer.toString();
        buffer.reverse();
        buffer.insert(4, "+");
        String res4 = buffer.toString();
        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
    }
}
