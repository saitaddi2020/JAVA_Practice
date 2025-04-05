import java.util.function.Function;

public class Student {
    String name;
    int age;
    int marks;

    Student(String name,int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }
    public static void main(String[] args) {
       Student sc = new Student("Arjun", 22, 92);
       sc.displayInfo();
    }
}
