package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        while (true) {
            Scanner kullvoikiri = new Scanner(System.in);
            System.out.println("sisestus");
            int kumb = kullvoikiri.nextInt();
            int arvuti = (int) (Math.random() * (2));
            if (kumb == arvuti) {
                System.out.println("arvuti " + arvuti + " sina " + kumb + " sinu voit");
            }
            if (kumb!=arvuti && kumb<=1&&kumb>=0){
                System.out.println("möödas");
            }
            if (kumb>1||kumb<0){
                System.out.println("0 voi 1, palun");
            }
            }
        }
    }
