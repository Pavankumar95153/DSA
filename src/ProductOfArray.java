public class ProductOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int leng= arr.length;
        ProductOfArray prOductOfArray = new ProductOfArray();
        var val=prOductOfArray.productArray(arr,leng);
        System.out.println("Product of Array is "+ val);

    }
    public int productArray(int arr[],int len){
        if(len <=0)
            return 1;
        return productArray(arr,len-1)*arr[len-1];
    }
}
