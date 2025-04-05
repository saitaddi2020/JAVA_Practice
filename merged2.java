import java.util.Arrays;
public class merged2 {
    public static void main(String[] args) {
        int[] num1 = {11,12,13,14,15};
        int[] num2 = {16,17,18,19,20};
        int length = num1.length+num2.length;
        int[] merged = new int[length];

        for(int i=0; i<num1.length;i++){
            merged[i]=num1[i];
        }
        for(int i=0; i<num2.length;i++){
            merged[num1.length+i]=num2[i];
        }System.out.println(Arrays.toString(merged));
    }
}
