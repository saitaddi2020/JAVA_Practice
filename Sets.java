import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> setOfItems = new HashSet<String>();
        setOfItems.add("arjun");
        setOfItems.add("shreyoshi");
        setOfItems.add("ram");
        setOfItems.add("vijay");

        System.out.println(setOfItems.size());
        for(String item : setOfItems){
                System.out.println(item);
        }
    }
}
