import java.util.Scanner;

public class SumDig {
    public static void main(String[] args) {
        SumDig sumDig = new SumDig();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        var value=sumDig.sumDigits(num);
        System.out.println("sum of Digits -> "+ value);
    }

    public double sumDigits( int n){
        double sumOfDigi = n/10 + n%10;
        return sumOfDigi;
    }
}
