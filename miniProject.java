import java.util.Scanner;
public class miniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);

        int userNumber = 0;
    do{
        System.out.println("Enter YOur Number:");
        userNumber = sc.nextInt();
    
     if(userNumber == myNum){
        System.out.println("Wooo....That's Correct");
        break;
    }else if (userNumber>myNum) {
        System.out.println("Your NUmber is too Large...");
    }else{
        System.out.println("your Number is small..");
    }
    } while (userNumber>0); {
        sc.close();
    }


    }
}