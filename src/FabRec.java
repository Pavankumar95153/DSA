public class FabRec {
    public static void main(String[] args) {
        FabRec fabRec = new FabRec();
        var val = fabRec.fabonacci(8);
        System.out.println("print the fabonacci value "+val);
    }
    public int fabonacci(int n){
        if (n<0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return  fabonacci(n-1)+ fabonacci(n-2);
    }
}
