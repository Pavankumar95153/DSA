import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        MaxProduct maxProduct = new MaxProduct();
       String valMul= maxProduct.maxProductArr(arr);
        System.out.println("Prodcut of pair of array "+ Arrays.asList(valMul));
    }
    int maxproduct =0; String pairs;
    public String  maxProductArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]>maxproduct)
                maxproduct = arr[i]*arr[j];
                pairs= Integer.toString(arr[i]) +","+ Integer.toString(arr[j]);
            }
        }
        return pairs;
    }
}
