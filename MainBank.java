//Encapsulation

class Banks {
private int balance;
String accountName;
private int accountNumber;
 
public int getBalance(){
return balance;
}
public void setBalance(int balance){
    this.balance = balance;
}




public String getAccountName(){
    return accountName;
}
public void setAccountName(String accountName){
    this.accountName = accountName;
}



public int getAccountNumber(){
    return accountNumber;
}
public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
}
}

public class MainBank {
public static void main(String[] args) {
    Banks bc = new Banks();
    System.out.println("Initial Balance: " + bc.getBalance());
    bc.setBalance(1000);
    System.out.println("Updated Balance: " + bc.getBalance());
}
    
}





