public class Strings1 {
    public static void main(String[] args) {
        String word1 = "hi, this is arjun";
        String word2 = "Hi, This is arjun";
        String word3 = "hi, this is arjun";
        String word4 = "Hi, My Name Is Arjun Arjun";
        String word5 = "";
        String word6 = " ";
        String word7 = "It is 2 times a day and 3 times a week";
        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word1.equalsIgnoreCase(word2));
        System.out.println(word1.toUpperCase());
        System.out.println(word2.toLowerCase());
        System.out.println(word1.contains("arjun"));
        System.out.println(word1.contains("Name"));
        System.out.println(word4.indexOf("r"));
        System.out.println(word4.indexOf("Arjun"));
        System.out.println(word4.charAt(13));
        System.out.println(word3.length());
        System.out.println(word1.isEmpty());
        System.out.println(word2.isEmpty());
        System.out.println(word6.isEmpty());
        System.out.println(word5.isEmpty());
        System.out.println(word6.isBlank());
        System.out.println(word4.replace("Arjun","Shreyoshi" ));
        System.out.println(word7.replaceAll("[^a-zA-Z]", " "));
        System.out.println(word7.replaceAll("[^0-9]", ""));
       String words[]= word1.split(" ");
       for(int x =0; x<words.length; x++){
        System.out.println(words[x]);
       }  
       System.out.println(word3.substring(4,8));

       String s1 = "My name is %s and My age is %d and my percentage is %f";

       System.out.println(String.format(s1, "arjun",12,90.80));

    }
}
