import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        PairSum pairSum =new PairSum();
        int arr[]= {22,3,4,5,6,7};
        int arri[] = pairSum.pairOfSum(arr,25);
        System.out.println("pair of array which satisfy target "+ Arrays.toString(arri));

    }
    public int [] pairOfSum(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int []{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No such element");
    }
}
