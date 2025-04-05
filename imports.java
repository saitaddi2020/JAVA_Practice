import java.util.Scanner;
public class imports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input you name");
        String name = sc.next();
        System.out.println(name);

        System.out.println("input your age");
        int age = sc.nextInt();
        System.out.println(age);
             sc.close();
    }
}
