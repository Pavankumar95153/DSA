public class Rotate90Matrix {
    public static void main(String[] args) {
        int arr [] [] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(arr);
//        reverse(arr);
        antiClockwise(arr);
        display(arr);

    }

    public static void transpose(int a[][]){
        int temp;
        for(int i=0;i<a.length;i++)
            for(int j=i;j<a.length;j++){
             temp= a[i][j];
             a[i][j]= a[j][i];
             a[j][i]=temp;
            }
    }

    public static void reverse(int a[][]){
        for(int i=0;i<a.length;i++){
            int k =a.length-1; int temp;
            for(int j=0;j<a.length/2;j++){
                temp= a[i][j];
                a[i][j]=a[i][k];
                a[i][k]=temp;
                k--;
            }

        }
    }
    public static void antiClockwise(int a[][]){
        for(int i =0;i<a.length;i++){
            int k= a.length-1;int temp;
            for(int j=0;j<a.length/2;j++){
                temp= a[j][i];
                a[j][i]=a[k][i];
                a[k][i]=temp;
                k--;
            }
        }
    }
    public static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


}
