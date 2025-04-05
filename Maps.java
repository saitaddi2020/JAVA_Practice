import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<String, String>();
        list.put("arjun", "vizag");
        list.put("shreyoshi", "barrackpore");
        list.put("nilavro", "shyamnagar");
        list.put("uddalok", "kolkata");
        list.put("dishanee", "kolkata");
        list.put("mayukh", "chandannagar");
        System.out.println(list.size());
        System.out.println(list.get("arjun"));
        System.out.println(list.get("shreyoshi"));
        System.out.println(list.containsKey("uddalok"));
        System.out.println(list.containsKey("beena"));

        Collection<String> keys = list.keySet();
        for(String str: keys){
           System.out.println(str + " Is From : " + list.get(str));
        }
        // Collection<String> values = list.values();
        // for(String str: values){
        //    System.out.println(str);
        // }
    }
   
}
