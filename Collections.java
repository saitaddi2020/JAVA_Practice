import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> collections =  new ArrayList<String>();
        collections.add("arjun");
        collections.add("shreyoshi");
        collections.add("Ram");
        collections.add("vijay");
        System.out.println(collections.size());
        System.out.println(collections.get(1));
        for(int x=0; x<collections.size(); x++){
                  System.out.println(collections.get(x));
        }
    }
}
