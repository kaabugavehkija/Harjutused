package teema1;

import java.util.Arrays;

/**
 * Created by Mario on 1/19/2016.
 */
public class Array {

    public static void main(String[] args) {
        int []max = {4,8,9,10,25};
        System.out.println(max(max));
    }

    public static int max(int[]array) {
        int []a2 = array.clone();
        Arrays.sort(a2);
        return (a2[a2.length-1]);
    }
}


