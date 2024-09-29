package CodeTest;
//Counting Duplicates
public class Duplicates {
    public static void main(String[] args){
        String str = "SaiRam";
        char [] ch = str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            count = 1;
            for(int j= i+1;j<ch.length;j++){
                if(ch[i]== ch[j]){
                    System.out.println("duplicate value is "+ch[i]);
                    count++;
                }
            }
        }
        System.out.println(" count duplicate "+count);

    }


}