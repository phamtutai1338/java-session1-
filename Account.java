package accountpkg;

public class Account {
    String accountNumber;
    String accountHolderName;
    String accountType;
    double balance;
    
   
        public Account(String accNo, String name, String accType, double bal) {
            System.out.println ("Parameterized Constructor Invoked");

            accountNumber =accNo;
            accountHolderName = name;               
            accountType = accType;
            balance = bal;
                
    }
}
