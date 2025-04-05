import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        String word = "madaaam";
        String reverseWord = "";

        for(int i =word.length()-1; i>=0; i--){
            reverseWord+=word.charAt(i);
        } if(word.equals(reverseWord)){
              System.out.println("IT is palindrome");
        }else{
            System.out.println("IT is not palindrome");
        }

    }
}