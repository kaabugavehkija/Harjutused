package teema1;

/**
 * Created by Mario on 12/6/2015.
 */
public class NumbersOutput {
    public static void main(String[] args) {
        int sum = 0;
        int n = 7;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                if (i % j == 0) {

                    sum += i;
                    //System.out.println("summa"+sum);
                }System.out.println(i);
                }
            }
        }






