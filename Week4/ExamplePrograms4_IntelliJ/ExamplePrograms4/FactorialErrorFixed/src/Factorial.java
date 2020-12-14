// an example with logical errors
public class Factorial {
    private static long factorial(int n)
    {
        long fac = 1;
        for (int i = 1; i <= n; i++) 
        {
            fac = fac * i;
        }
        return fac;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1)
        {
            System.err.println("One parameter expected.");
            System.exit(-1);  
        }
        int n = Integer.parseInt(args[0]);
        long fac = factorial(n);
        System.out.println(n + "!=" + fac);
    }
}
