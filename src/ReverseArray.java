import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for (int i=0; i<arr.length/2;i++){
            int other = arr.length -i -1;
            int temp = arr[i];
             arr[i]= arr[other];
             arr[other]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
