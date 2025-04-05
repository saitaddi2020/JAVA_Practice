abstract class  Bank {
int balance;
Bank(){
    balance =100;

}
   public abstract void displayInterest();
   public void deposit(int amount){
    balance += amount;
    System.out.println("New Balance after deposit: " + balance);
   } 
   }

   
   class HDFCBank extends Bank{
    @Override
    public void displayInterest(){
        System.out.println("2.5%");
    }
}

class CITIBANK extends Bank{
    @Override
    public void displayInterest(){
        System.out.println("3.4%");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        HDFCBank hb = new HDFCBank();
        CITIBANK cb = new CITIBANK();

        hb.displayInterest();
        cb.displayInterest();

        hb.deposit(500);
    }
}
