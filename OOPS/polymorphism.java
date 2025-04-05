//Method Overloading


class Bank {
    public void createAccount(String accName, int accountNumber){
         System.out.println("Account Created With "+ accName + "Account Number" + accountNumber);
    }
    public void createAccount(String accName, String accType, int accBalance){
        System.out.println("Account Created With "+ accName + "Account Type"+ accType);
    }
    public void createAccount(String accName, int accBalance, String accType){
        System.out.println("Account Created With "+ accName + "Account Type"+ accType );
    }
}
