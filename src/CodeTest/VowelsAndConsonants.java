package CodeTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//VowelsAndConsonants
public class VowelsAndConsonants {
    public static void main(String[] args){
//      System.out.println(countVowelsAndConsonants("SaiRam"));
        String str = "SaiRam";
        long vowels = str.chars().filter(e -> allVowels.contains((char)e)).count();
        long consonants = str.chars().filter(e -> !allVowels.contains((char) e))
                .filter(ch ->( ch >= 'a' && ch <= 'z')).count();
        System.out.println("Vowels->"+vowels+"consonants"+consonants);
    }
    private static final Set<Character> allVowels =
            new HashSet(Arrays.asList('a','e','i','o','u'));

    public static Map<Long, Long> countVowelsAndConsonants(String str){
        long count = str.chars().filter(e -> allVowels.contains((char) e)).count();
        long count1 = str.chars().filter(e -> !allVowels.contains((char) e))
                .filter(ch -> (ch>='a' && ch<='z')).count();
        return Map.of(count,count1);
    }

}