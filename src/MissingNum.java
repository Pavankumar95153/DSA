public class MissingNum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10};
        int sumArr =0; int sum=0;
        for(int i:arr){
           sumArr+=i; //sumArr = sumArr+i
        }
//        System.out.println("sum of array is "+sumArr);
        sum = 10*(10+1)/2;
        int differ = sum-sumArr;
        System.out.println("missing of the number "+differ);
    }
}
