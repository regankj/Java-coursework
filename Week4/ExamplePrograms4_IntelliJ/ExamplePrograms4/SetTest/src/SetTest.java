import java.util.*;
public class SetTest 
{
    // use set to record car registrations with parking permit 
    public static void main(String[] args) 
    {
        Set<String> regNums = new HashSet<String>();
        regNums.add("CK14EAD");
        regNums.add("DV59CDE");
        regNums.add("CA61VAE");
        System.out.println(regNums);   
        
        System.out.println(regNums.add("DV59CDE"));
        System.out.println(regNums);
        
        System.out.println(regNums.remove("DV59CDE"));
        System.out.println(regNums);
        
        System.out.println(regNums.remove("DV59CDE"));
        System.out.println(regNums);
    }
}
