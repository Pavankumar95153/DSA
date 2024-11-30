package CodeTest;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
      System.out.println("Enter the number: ");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println("Square root of: "+ squareRoot(num));
    }

    public static double squareRoot(int num){
        double t;
        double squareroot = num/2;
        do{
           t = squareroot;
           squareroot = (t+(num/t))/2;
        } while((t-squareroot)!=0);
        return squareroot;
    }
}