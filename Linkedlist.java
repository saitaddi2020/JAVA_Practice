import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        List<String> linkeList =  new LinkedList<String>();
        linkeList.add("arjun");
        linkeList.add("shreyoshi");
        linkeList.add("Ram");
        linkeList.add("vijay");
        System.out.println(linkeList.size());
        System.out.println(linkeList.get(1));
        for(int x=0; x<linkeList.size(); x++){
                  System.out.println(linkeList.get(x));
        }
    }
}

