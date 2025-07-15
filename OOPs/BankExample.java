class BankAccount{
    double balance;
    String accoutType;

    public BankAccount(double _balance){
        balance= _balance;
        accoutType= "Saving";
    }

    public BankAccount(double _balance, String _accountType){
        balance = _balance;
        accoutType = _accountType;
    }

    //  setters
    public void setBalance(double balance){
        this.balance = balance;

    }

    // getters
    public double getBalance(){
        return balance;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void printAccoutType(){
        System.out.println(accoutType);
    }
}


public class BankExample {
        

    public static void main(String[] args){
        BankAccount accountPerson1 = new BankAccount(200);
        accountPerson1.setBalance(300);
        accountPerson1.printBalance();

        BankAccount accountPerson2 = new BankAccount(300, "current");
        // accountPerson2.printBalance();
        accountPerson2.printAccoutType();
    }
    

}
