import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchValArray {
    public static void main(String[] args) {
        int arr []={10,20,30,40,50,60};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==40) {
                System.out.println("Index value of first array " + i);
                return;
            }
        }
        System.out.println("element unable to find with target value");
    }
}
