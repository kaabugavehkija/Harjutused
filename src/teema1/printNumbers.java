package teema1;

/**
 * Created by Mario on 1/21/2016.
 */
public class printNumbers {
    public static void main(String[] args) {

        System.out.println(numUnique(3, 2, 4));
    }

    public static int numUnique(int a, int b, int c) {
        int k = 0;
            if (a != b && b != c) {
                k = 3;
            }if (a != b && b == c) {
            k = 2;
            }if (a == c && b != c) {
            k = 2;
            }if (a == b && b != c) {
            k = 2;
            }if (a == b && b == c){
            k = 1;
        }
        return k;
    }

    }
