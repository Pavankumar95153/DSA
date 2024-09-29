package CodeTest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//First non-repeated string.
public class FindFirstNonRepeated {
    public static void main(String[] args){
//      System.out.println(non_repeated_char("Sai Ram"));
        String str = "SaiRam";
        LinkedHashMap<Integer, Long> result = str.codePoints().mapToObj(c -> c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));
        int cp = result.entrySet().stream().filter(e-> e.getValue()==1)
                .findFirst().map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        System.out.println(String.valueOf(Character.toChars(cp)));
    }
    public static char non_repeated_char(String str){

        Map<Character, Integer> result = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            result.compute(ch,(k,v)->(v==null)?1:++v);
        }
      for(Map.Entry<Character,Integer> e: result.entrySet())
          if(e.getValue()==1){
              return e.getKey();
          }

        return Character.MIN_VALUE;
    }
}