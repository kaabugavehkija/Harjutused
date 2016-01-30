package teema1;

/**
 * Created by Mario on 1/30/2016.
 */
public class sik2 {
        public static void printRow(int[] row) {
            for (int i : row) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int twoDm[][]= new int[5][7];
            int i,j,k=1;

            for(i=0;i<5;i++) {
                for(j=0;j<7;j++) {
                    twoDm[i][j]=k;
                    k++;
                }
            }

            for(int[] row : twoDm) {
                printRow(row);
            }
        }
                }


