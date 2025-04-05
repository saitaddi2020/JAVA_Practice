
public class Pattern2 {
    public static void main(String[] args) {
        int x;
        int y;
        for(x=4; x>=1; x--){
            for(y=x; y>=1; y--){
                System.out.print("*");
            } System.out.println();
        }
    
        int i;
        int j;
        for(i=1; i<=4; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            } System.out.println();
        }
    }
}
