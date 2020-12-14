public class BankAccount {
    private String holderName;
    private double balance;
    private String number;

    public BankAccount( String holderName, String number ){
        this.holderName = holderName;
        this.number = number;
        balance = 0;
    }

    public BankAccount( String holderName, String number, double balance){
        this.holderName = holderName;
        this.number = number;
        this.balance = balance;
    }

    public String getName(){
        return holderName;
    }

    public void setName( String newName ){
        holderName = newName;
    }

    public void deposit( double amount ){
        balance += amount;
    }

    public void withdraw( double amount ){
        balance -= amount;
    }

    public double checkBalance(){
        return balance;
    }

    public String toString(){
        String s = number + "\t" + holderName + "\t" + balance;
        return s;
    }
}
