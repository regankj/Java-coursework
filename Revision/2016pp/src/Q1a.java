public class Q1a {
    public static void main(String[] args){
        int i = 23;
        double d = 3.2;
        double res1 = Math.round((double)i /5) + d;
        double res2 = (double)(d * (1/3) + i);
        StringBuffer buffer = new StringBuffer("Hello" + i);
        buffer.replace(2, 4, "abc");
        String res3 = buffer.toString();
        buffer.append('#');
        buffer.reverse();
        String res4 = buffer.toString();

        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
    }
}
