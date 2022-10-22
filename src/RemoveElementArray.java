import java.util.Arrays;

public class RemoveElementArray {
    public static void main(String[] args) {
        int myArr[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Orginal value " + Arrays.toString(myArr));
        int removeIndex =1;
        for(int i = removeIndex;i<myArr.length-1;i++){
            myArr[i] =myArr[i+1];
        }
        int len=myArr.length-1;
        for(int i=0;i<len;i++){
            System.out.println("myArr["+i+"] = "+myArr[i]);;
        }
//        System.out.println(" Test Of removal Array"+Arrays.toString(myArr));
    }
}
