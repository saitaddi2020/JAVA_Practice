public class vowels {
    public static void main(String[] args) {
        String word = "shreyoshi";
        int vowel = 0;
        int consonants = 0;
        for(char c:word.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                vowel++;
            }else{
                consonants++;
            } 
        }System.out.println("vowel "+ vowel +" "+"consonants "+ consonants);
    }
}
Find the largest number in an array
