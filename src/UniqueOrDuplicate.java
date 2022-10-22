public class UniqueOrDuplicate {

    public static int arr[]={1,2,3,4,5,5};
    public static void main(String[] args) {

        UniqueOrDuplicate uniqueOrDuplicate = new UniqueOrDuplicate();
        boolean val=uniqueOrDuplicate.unique(arr);
        System.out.println("it's an unique array "+val);
    }
    public boolean unique(int [] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    System.out.println("having duplicate-->"+arr[i]+","+arr[j]);
                    return false;
                }
            }
        return true;
    }
}
