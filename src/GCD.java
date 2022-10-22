public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        var valOfGcd = gcd.gcdVal(8,4);
        System.out.println("value of GCD "+valOfGcd);
    }

    public int gcdVal(int a, int b){
        if(a<0 || b<0)
            return -1;
        if(b==0)
            return a;
        return gcdVal(b,a%b);
    }
}
