package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        kasutajaSisestus(3, 10, 100);
    }

    public static int tostaKuupi(double arv) {
        System.out.println(Math.pow(arv, 3));
        return 0;
    }

    public static int kasutajaSisestus(int kysimus, int min, int max) {
        Scanner sisestus = new Scanner(System.in);
        System.out.println("sisesta arv ");
        kysimus = sisestus.nextInt();
        while (kysimus < min || kysimus > max) {
            System.out.println("sisesta arv ");
            kysimus = sisestus.nextInt();
            }
        if (kysimus>min &&kysimus<max){
            System.out.println("sisestasid "+kysimus);
            System.out.println("vahemik "+min+ " kuni "+ max);
        }

            return 0;
        }
    }