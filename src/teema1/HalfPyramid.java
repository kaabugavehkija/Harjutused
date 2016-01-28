package teema1;

/**
 * Created by Mario on 1/8/2016.
 */
public class HalfPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i=i+2) {
            for (int j = 0; j < (10 - i); j=j+2) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                }
            for (int k = 1; k <(9-i) ; k=k+2) {
                System.out.print("-");
            }
            System.out.println("-");
        }
    }
}