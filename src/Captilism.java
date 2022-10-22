public class Captilism {
    public static void main(String[] args) {
        String str = "pavan";
        Captilism captilism = new Captilism();
        captilism.caps(str);
//        System.out.println("print the value of string "+stra);
    }
    public void caps(String str1){
        String withoutspace[] = str1.split("\\s");
        String result="";
        for(String w: withoutspace){
//            System.out.println(w);
            String sr=w.substring(0,1).toUpperCase();
            String ing= w.substring(1);
             result = result+sr+ing+" ";

        }
        System.out.println(result);
    }
}
