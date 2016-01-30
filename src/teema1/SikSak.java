package teema1;

/**
 * Created by Mario on 1/30/2016.
 */
public class SikSak {
    public static void main(String[] args) {
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i==j) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 9; i > 0; i--) {
                for (int j = 9; j > 0; j--) {
                    if (i + j == 10) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
}
