class Bank{
    public void interestRate(){
        System.out.println("Standard Interest Rate 4%");
    }
}
class HDFCBank extends Bank{
    @Override
    public void interestRate(){
        System.out.println("Special Rate 3.7%");
    }
}
class SBIBank extends Bank{
    @Override
    public void interestRate(){
        System.out.println("special Rate 2.8%");
    }
}



public class overRide {
    public static void main(String[] args) {
        HDFCBank hb = new HDFCBank();
        SBIBank sb = new SBIBank();
        hb.interestRate();
        sb.interestRate();

        
    }
}
