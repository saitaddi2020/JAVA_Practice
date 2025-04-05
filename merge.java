import java.util.Arrays;
public class merge {
    public static void main(String[] args) {
        int[] numbers1 = {10,20,30,40};
        int[] numbers2 = {50,60,70,80,};
       
        int numLength = numbers1.length+numbers2.length;
        int[] merged = new int[numLength];
        for(int i=0;i<numbers1.length;i++){
             merged[i]=numbers1[i];
        }
        for(int i=0; i<numbers2.length;i++){
            merged[numbers1.length+i]=numbers2[i];
        }System.out.println(Arrays.toString(merged));
    }
}
