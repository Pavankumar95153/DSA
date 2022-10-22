public class Power {
    public static void main(String[] args) {
Power pwr = new Power();
var value = pwr.power(3,2);
        System.out.println("power value is "+ value);
    }

    public int power(int base,int exp){

        if( exp <0){
            return -1;
        }
        if ( exp==0){
            return 1;
        }
        return base* power(base, exp-1);
    }
}
