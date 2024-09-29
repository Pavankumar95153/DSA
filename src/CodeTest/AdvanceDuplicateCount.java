package CodeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdvanceDuplicateCount {

    public static void main(String[] args){
//System.out.println(charCount("SaiRam"));
//        System.out.println(duplicateCount("Sai Ram"));
        String str = "SaiRam";
        Map<Character, Long> result = str.chars().mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println("duplicate values-->"+result);

    }

    public static Map<Character,Integer> charCount(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (char cha: str.toCharArray()){
         map.compute(cha,(k,v)->(v==null)?1: ++v);
        }
        return map;
    }

   /* public static Map<Character, Long> duplicateCount(String str){
        Map<Character,Long> result = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        return result;
    }*/
}