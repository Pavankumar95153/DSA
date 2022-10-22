import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        Rec rec = new Rec();
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println("Please enter the value of the factorial "+ n );
        System.out.println("address of the object "+ rec);
        var a =rec.factorial(n);
        System.out.println("Factorial of num "+n+" is "+a);
    }
    public int factorial(int n){
        if(n<1){
            return  -1;
        }
        if (n ==0 || n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
