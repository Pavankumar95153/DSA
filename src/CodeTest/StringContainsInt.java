package CodeTest;

public class StringContainsInt {
    public static void main(String[] args){
//      System.out.println(findStringWithInteger("Sai Ram1"));
        System.out.println(findIntegerInStringJ8("Sai Ram1"));
    }
    public static boolean findStringWithInteger(String str){

        char ch[] = str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean findIntegerInStringJ8(String str){
        boolean value = str.chars().anyMatch(e->Character.isDigit(e));
        return  value;
    }

}