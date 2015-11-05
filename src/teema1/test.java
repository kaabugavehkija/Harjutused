package teema1;

import java.util.Scanner;

/**
 * Created by Mario on 10/23/2015.
 */
public class test {
    public static void main(String[] args) {
        Scanner arv = new Scanner(System.in);
        System.out.println("sisesta 0-1");
        int sisestus = arv.nextInt();
        int suvaline = (int) (Math.random() * (2));
        System.out.println(suvaline);
            while (sisestus >1) {
                System.out.println("0 või 1, palun");
                System.out.println("uus sisestus");
                sisestus = arv.nextInt();
            }
            if (sisestus == suvaline) {
                System.out.println("tubli");
                System.out.println("uus sisestus");
                sisestus = arv.nextInt();
                }
            }
        }