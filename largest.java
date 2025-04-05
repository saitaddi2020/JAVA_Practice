import java.util.Arrays;
public class largest {
    public static void main(String[] args) {
        int[] numbers = {10,20,6,8,99,88};
        Arrays.sort(numbers);
        
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
    }

}
