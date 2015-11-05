package teema1;

import java.util.*;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {
    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<Integer>();
        int i = 0;
        while (i < 5) {
            Scanner sisestus = new Scanner(System.in);
            System.out.println("sisest arv  ");
            int arv = sisestus.nextInt();
            arvud.add(arv);
            i++;
            Collections.sort(arvud);
        }
        System.out.println("sorteeritud arvud"+arvud);

        int k;
        int sum = 0;
        for (k = 0; k < arvud.size(); k++) {
            sum = sum + arvud.get(k);
        }
        System.out.println("pikkus " + arvud.size());
        System.out.println("summa " + sum);
    }
}

/*public class Harjutus4_massiivid {
    public static void main(String[] args) {
        ArrayList<String> soned = new ArrayList<String>();
        int i = 0;
        while (i < 5) {
            Scanner sisestus = new Scanner(System.in);
            System.out.println("sisest sone  ");
            String sone = sisestus.next();
            soned.add(sone);
            i++;
            Collections.sort(soned); //sorteerib sõned

            }System.out.println(soned);
        }
    }*/

/*public class Harjutus4_massiivid {
    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<Integer>();
        Scanner sisestused=new Scanner(System.in);
        System.out.println("arv ");
        int sisest=sisestused.nextInt();
        while (sisest!=0){
            arvud.add(sisest);
            System.out.println("arv ");
            sisest = sisestused.nextInt();
        }
        Collections.sort(arvud);//sorteerib
        System.out.println(arvud);
        }
    }*/