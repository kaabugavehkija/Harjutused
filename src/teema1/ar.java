package teema1;

/**
 * Created by Mario on 1/30/2016.
 */
public class ar {
    public static void main(String[] args) {
        int[][]a = new int[5][5];
        a[1][1]=85;
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }

    }
}
