public class factorial {
    public static void main(String[] args) {
        int number = 6;
        long fact = 1;
        for(int i=1; i<=number; i++){
            fact*=i;
        }System.out.println(fact);
    }
}
