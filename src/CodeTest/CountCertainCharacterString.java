package CodeTest;
//Count the certain repeated character in a string
public class CountCertainCharacterString {
    public static void main(String[] args){
        System.out.println(countOfrepeatedChar("SaiBaba",'a'));
    }
    public static int countOfrepeatedChar(String str, char ch){
        return str.length()-str.replace(String.valueOf(ch),"").length();
    }
}