package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
/*public class Harjutus1_tsyklid {

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        for (int i = 1; i<10; i=i+2) {
            System.out.println(i);
        }
    }
}*/

public class Harjutus1_tsyklid {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for (i = 0; 10 > i; i++) { //10 rida tekitan
            System.out.println(""); // i tsükkel annab tühja rea - println on lihtsalt reavahetus iga i -ga
            for (j = i; 10 > j; j = j + 1) { //iga rida algab sellest nr-st, mitmes i parasjagu käsil on
                System.out.print(j + " "); // // siin on oluline, et tsükkel oleks suletud ("}")
            }
            for (k = 0; i > k; k++) {  //samal realt j-ga algab k tsükkel, nii kaua lastakse k-sid välja, kuni k on väiksem kui rea number (i)
                System.out.print(k + " ");
            }
        }
    }
}