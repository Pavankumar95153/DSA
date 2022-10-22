import java.util.Scanner;

public class TemperaturCheck {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("No, of Days ");
        int numDays = scr.nextInt();
        int temp[]= new int[numDays];
        int sum=0;
        for(int i=0;i<numDays;i++){
            System.out.println("Day's of "+(i+1)+" temperature?");
            temp[i] = scr.nextInt();
            sum += temp[i];
        }
        int averageTemp= sum/numDays;
        int above =0;
        for( int i=0; i<temp.length;i++){
            if(temp[i]>averageTemp)
                above++;
        }
        System.out.println("Average temp of "+numDays+" days is "+averageTemp);
        System.out.println("Above average temp "+above);

    }
}
