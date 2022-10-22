import java.util.Scanner;

public class Dec2Bin {
    public static void main(String[] args) {
        Dec2Bin dec2Bin = new Dec2Bin();
        Scanner scanner = new Scanner(System.in);
        int vcl= scanner.nextInt();
        var val=dec2Bin.decimalToBin(vcl);
        System.out.println("Decimal to Bin val is "+val);
    }

    public int decimalToBin(int n){
        if(n ==0)
            return 0;
        return n%2 + 10*decimalToBin(n/2); // n mod 2 +10* f(n/2)
    }
}
