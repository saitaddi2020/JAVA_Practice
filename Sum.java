import java.util.Scanner;

public class Sum {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter The First number");
int firstNum = sc.nextInt();

// Scanner num = new Scanner(System.in);
System.out.println("Enter the Second Number");
int secondNum = sc.nextInt();

int operation = firstNum+secondNum;
System.out.println("The sum of "+ firstNum + " and "+ secondNum + " is " + operation);
}
}