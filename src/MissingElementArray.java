public class MissingElementArray {
  public static void main(String[] args) {
    int a[] ={1,2,3,4,6};
//    MissingElementArray missingElementArray = new MissingElementArray();
    int missVal= missingVal(a,6);
    System.out.print(missVal);
  }
  public static int missingVal(int arr[],int val){
    int sumArr=0;int sum=0;
    for(int i:arr){
      sumArr+=i;
    }
//    System.out.println(sumArr);
    sum = val*(val+1)/2;
    int differMissingVal= sum-sumArr;
    if (differMissingVal < 0) {System.out.println("missing element is invalid");
    } else System.out.println("missing value is");
    return differMissingVal;
  }
}
