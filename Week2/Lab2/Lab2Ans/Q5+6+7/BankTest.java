public class BankTest {
    public static void main(String[] args) {
    	BankAccount b = new BankAccount( "M J W Morgan", "0012067");
    	System.out.println(b);
    	b.deposit(100);
    	System.out.println(b);
    	b.withdraw(500);
    	System.out.println(b);


    	if( args.length == 2 ){
			BankAccount c = new BankAccount( args[0], args[1]);
			System.out.println(c);    		
    	} else {
    		BankAccount c = new BankAccount( args[0], args[1], Double.parseDouble(args[2]) );
			System.out.println(c);    		
    	}



    }
}