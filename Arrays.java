// int listItem[];
// int listItems[] = new int[5];
// int listItemss[]= {10,20,30,40,50};


public class Arrays {
    
    public static void main(String[] args) {
        int x;
        int listItems[] = {10,20,30,40,50};
        System.out.println(listItems[3]);
        System.out.println(listItems.length);
        for(x=0; x<listItems.length; x++){
            System.out.println(listItems[x]);
        }
        int sum = 0;
        for(x=0; x<listItems.length; x++){
            sum = sum + listItems[x];
        
        }System.out.println(sum);
    }
}


