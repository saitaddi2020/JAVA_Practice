import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age");
         int age =  sc.nextInt();


         if(age<18){
            System.out.println("You are a minor");
         }else if(age>=18 && age<21){
            System.out.println("you are a major but not allowed to contest in elections");
         }else{
            System.out.println("you are a major and can contest in elections");
         }
    }
}
