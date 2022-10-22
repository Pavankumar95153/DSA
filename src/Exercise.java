public class Exercise {

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        var val =exercise.fib(4);

        System.out.println("Product of array "+val);
    }

    public int fib(int n) {
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }



}