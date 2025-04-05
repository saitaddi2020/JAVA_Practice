class Basic{
    public void sum(int num1, int num2){
System.out.println(num1+num2);
    }
    public void sub(int num1, int num2){
        System.out.println(num1-num2);
    }
}

class Advance extends Basic{
    public void mul(int num1, int num2){
        System.out.println(num1*num2);
    }
    public void div(int num1, int num2){
        if(num2 != 0){ 
            System.out.println(num1/num2);
        }else{
            System.out.println("The number is not divisible by 0");
        }}
       
}


public class inheritance {
    public static void main(String[] args) {
    Advance ac = new Advance();
     ac.sum(50, 60);
     ac.sub(60, 50);
     ac.mul(10, 20);
     ac.div(50, 10);
    }
}
