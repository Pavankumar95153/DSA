package CodeTest;
//Reverse Word
public class ReversWord {
    public static void main(String[] args){
      String str = "Sai Ram";
      String whiteSpace = " ";
      String [] words=str.split(whiteSpace);
      StringBuilder reverseString = new StringBuilder();
      for(String word: words){
          StringBuilder strbuilder = new StringBuilder();
          for(int i = word.length()-1;i>=0;i--){
              strbuilder.append(word.charAt(i));
          }
          reverseString.append(strbuilder).append(whiteSpace);
      }
      System.out.println(reverseString.toString());

    }
}