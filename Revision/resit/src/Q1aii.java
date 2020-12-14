

public class Q1aii {
    public static void main(String[] args){
        int n = 5;
        String res = "";
        String val;
        for (int i=0; i<=n; i++){
            val = "" + i;
            res = res + val.repeat(i);
        }
        StringBuffer buffer = new StringBuffer(res);
        buffer.reverse();
        System.out.println(res);
    }
}
