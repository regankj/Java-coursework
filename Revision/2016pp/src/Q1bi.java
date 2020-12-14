public class Q1bi {
    public static void main(String[] args){
        String str = "12a3";

        String numOnly = str.replaceAll("\\D+", "");
        System.out.println(numOnly);
        }
}

