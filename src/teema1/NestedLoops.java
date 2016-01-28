package teema1;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <40 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print("_-^-");
        }System.out.println();
        for (int k = 1; k < 3; k++) {//mitu korda kogu allpool olevat arvude mustrit välja laseb
            for (int i = 1; i < 11; i++)//mis arvuni
                for (int j = 1; j < 3; j++) {//mitu korda sama arvu
                    System.out.print(i%10);
                }
        }System.out.println("");
        for (int i = 0; i <40 ; i++) {
            System.out.print("-");
        }
        }
        }
