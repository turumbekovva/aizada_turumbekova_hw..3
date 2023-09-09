public class Main {
    public static void main(String[] args) {
        //1
        double [] num = {3, 5, 6, 7, -1, 9, 4, 2, -8, 10, 23, -2, 15, 11, 29};
        //2
        double sum = 0 ;
        int count = 0 ;
        boolean fal = false ;
        for (double number : num) {
          if (number < 0) {
              fal = true;
          }
          if (fal == true && number > 0 ) {
              count++ ;
              sum += number ;
          }
        }
        System.out.println(sum / count);
    }
}