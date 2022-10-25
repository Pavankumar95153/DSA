public class SquareRoot {
  public static void main(String[] args) {
double val = squarRoot(25);
    System.out.println("square root of value"+val);
  }
  public static double squarRoot(int num){
      double t=0;
      double sqrt = num/2;
      do{
          t=  sqrt;
          sqrt = (t+(num/t))/2;
      }while((t-sqrt)!=0);
  return sqrt;
  }

}